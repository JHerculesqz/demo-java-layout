package com.huawei._1_fw.component.layout.subprovider.rulefile;

import java.util.List;

import com.huawei._1_fw.component.layout.vo.graph.GraphvizGraphVo;
import com.huawei._1_fw.component.layout.vo.rule.coordinate.SubGraphCoordinateRuleKeyVo;
import com.huawei._1_fw.component.layout.vo.rule.layout.SubgraphLayoutRuleVo;
import com.huawei._1_fw.component.layout.vo.rule.split.GraphSplitRuleVo;

public class RuleFileProvider {
	// #region genGraphVo

	public static GraphvizGraphVo genGraphVo(String strRuleName,
			List<SubGraphCoordinateRuleKeyVo> lstSubGraphCordinateRuleKeyVo) {
		// 1.get oGraphSplitRuleVo

		// 2.get oSubGraphLayoutRuleVo

		// 3.get oSubGraphCoordinateRuleVo

		// 4.����oGraphSplitRuleVo/oSubGraphLayoutRuleVo/oSubGraphCoordinateRuleVo,gen
		// oGraphvizRuleVo

		// 5.����lstSubGraphCoordinateRuleKeyVo��oGraphvizRuleVo.subGraphCoordinateRuleVo,
		// ���oSubGraphCoordinateRuleRowVo

		// 6.����oGraphvizRuleVo,���oGraphvizGraphVo
		// 6.1.����oGraphvizGraphVo.graphSplitRuleVo,���oGraphvizGraphVo
		// (ȱ��lstSubGraph֮���lstEdge4SubGraph)

		// 6.2.�ݹ�oGraphvizGraphVo,���oGraphvizGraphVoThisIter
		// 6.2.0.����oGraphvizGraphVoThisIter.lstSubGraph�����lstEdge4SubGraph,
		// ��ӵ�oGraphvizGraphVoThisIter.lstEdge

		// 6.2.1.����oGraphvizRuleVo.subGraphLayoutRuleVo,
		// ����oGraphvizGraphVoThisIter.graphvizRuleInstanceVo.enumLayoutType

		// 6.2.2.����oGraphvizRuleVo.subGraphCordinateRuleRowVo,
		// ����oGraphvizGraphVoThisIter.graphvizRuleInstanceVo.xOffsetOnGraph
		// ����oGraphvizGraphVoThisIter.graphvizRuleInstanceVo.yOffsetOnGraph
		// ����oGraphvizGraphVoThisIter.graphvizRuleInstanceVo.heightOnGraph
		// ����oGraphvizGraphVoThisIter.graphvizRuleInstanceVo.widthOnGraph

		return null;
	}

	// #endregion

	// #region readSplitFile

	public static GraphSplitRuleVo readSplitFile(String strFilePath) {
		GraphSplitRuleVo oGraphSplitRuleVo = new GraphSplitRuleVo();
		// TODO
		return oGraphSplitRuleVo;
	}

	// #endregion

	// #region readLayoutRuleFile

	public static SubgraphLayoutRuleVo readLayoutRuleFile(String strFilePath) {
		SubgraphLayoutRuleVo oSubgraphLayoutRuleVo = new SubgraphLayoutRuleVo();
		// TODO
		return oSubgraphLayoutRuleVo;
	}

	// #endregion

	// #region readCoordinateFile

	public static SubgraphLayoutRuleVo readCoordinateFile(String strFilePath) {
		SubgraphLayoutRuleVo oSubgraphLayoutRuleVo = new SubgraphLayoutRuleVo();
		// TODO
		return oSubgraphLayoutRuleVo;
	}

	// #endregion

	// #region readAttrFile

	// #endregion
}
