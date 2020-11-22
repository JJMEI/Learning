package com.mjj.sentinel.demo.demo;

import com.alibaba.csp.sentinel.Entry;
import com.alibaba.csp.sentinel.SphU;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;

import java.util.ArrayList;
import java.util.List;

public class CodeUsageDemo {


    public static void main(String[] args) {
        initFlowRules();

        while (true){
            Entry entry = null;

            try {
                entry = SphU.entry("HelloWorld");
                System.out.println("hello world");
            } catch (BlockException e) {
                System.out.println("block!");
            }finally {
                if(entry!=null){
                    entry.exit();
                }
            }
        }
    }



    private static void initFlowRules(){
        List<FlowRule> rules = new ArrayList<>();
        FlowRule rule = new FlowRule();
        rule.setResource("HelloWorld");
        rule.setGrade(RuleConstant.FLOW_GRADE_QPS);

        // set limit QPS to 20
        rule.setCount(2000);

        rules.add(rule);

        FlowRuleManager.loadRules(rules);


    }
}
