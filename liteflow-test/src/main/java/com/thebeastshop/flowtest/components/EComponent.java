/**
 * <p>Title: liteFlow</p>
 * <p>Description: 轻量级的组件式流程框架</p>
 * <p>Copyright: Copyright (c) 2017</p>
 * @author Bryan.Zhang
 * @email weenyc31@163.com
 * @Date 2017-8-1
 * @version 1.0
 */
package com.thebeastshop.flowtest.components;

import com.thebeastshop.liteflow.core.NodeComponent;
import org.springframework.stereotype.Component;

@Component("e")
public class EComponent extends NodeComponent {

	@Override
	public void process() {
		try {
			Thread.sleep(120L);
			System.out.println("E:" + this.getSlot().getOutput("a"));
			this.getSlot().setOutput(this.getNodeId(), "E component output");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Eomponent executed!");

	}

}
