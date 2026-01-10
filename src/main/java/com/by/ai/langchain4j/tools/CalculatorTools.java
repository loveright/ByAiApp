package com.by.ai.langchain4j.tools;

import dev.langchain4j.agent.tool.P;
import dev.langchain4j.agent.tool.Tool;
import dev.langchain4j.agent.tool.ToolMemoryId;
import org.springframework.stereotype.Component;

/**
 * @author zhouboyang
 * @version 1.0
 * @ClassName CalculatorTools
 * @description: 助手辅助工具，扩展助手特定功能
 * @date 2026/1/10 10:52
 */
@Component
public class CalculatorTools {

    // @Tool
    @Tool(name = "加法",value = "返回两个参数相加之和")
    double sum(
            @ToolMemoryId int memoryId,
            @P(value = "加数1",required = true) double a,
            @P(value = "加数2",required = true) double b
    ) {
        System.out.println("调用加法运算");
        System.out.println("memoryId: " + memoryId);
        return a + b;
    }

    @Tool
    double squareRoot(double a) {
        System.out.println("调用平方根运算");
        return Math.sqrt(a);
    }
}
