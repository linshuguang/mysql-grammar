// Generated from name\lsg\MySqlParser.g4 by ANTLR 4.3
package name.lsg;



  import java.util.regex.Pattern;
  import java.util.*;
  import name.lsg.grammar.*;
  import name.lsg.grammar.statement.*;
  import name.lsg.grammar.id.*;
  import name.lsg.grammar.definition.*;
  import name.lsg.grammar.constraint.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MySqlParser}.
 */
public interface MySqlParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code selectIntoVariables}
	 * labeled alternative in {@link MySqlParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 */
	void enterSelectIntoVariables(@NotNull MySqlParser.SelectIntoVariablesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectIntoVariables}
	 * labeled alternative in {@link MySqlParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 */
	void exitSelectIntoVariables(@NotNull MySqlParser.SelectIntoVariablesContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#indexColumnNames}.
	 * @param ctx the parse tree
	 */
	void enterIndexColumnNames(@NotNull MySqlParser.IndexColumnNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#indexColumnNames}.
	 * @param ctx the parse tree
	 */
	void exitIndexColumnNames(@NotNull MySqlParser.IndexColumnNamesContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#binlogStatement}.
	 * @param ctx the parse tree
	 */
	void enterBinlogStatement(@NotNull MySqlParser.BinlogStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#binlogStatement}.
	 * @param ctx the parse tree
	 */
	void exitBinlogStatement(@NotNull MySqlParser.BinlogStatementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code tableOptionTablespace}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionTablespace(@NotNull MySqlParser.TableOptionTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionTablespace}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionTablespace(@NotNull MySqlParser.TableOptionTablespaceContext ctx);

	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link MySqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(@NotNull MySqlParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link MySqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(@NotNull MySqlParser.NotExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#dropView}.
	 * @param ctx the parse tree
	 */
	void enterDropView(@NotNull MySqlParser.DropViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#dropView}.
	 * @param ctx the parse tree
	 */
	void exitDropView(@NotNull MySqlParser.DropViewContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#variableClause}.
	 * @param ctx the parse tree
	 */
	void enterVariableClause(@NotNull MySqlParser.VariableClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#variableClause}.
	 * @param ctx the parse tree
	 */
	void exitVariableClause(@NotNull MySqlParser.VariableClauseContext ctx);

	/**
	 * Enter a parse tree produced by the {@code sqlGapsUntilOption}
	 * labeled alternative in {@link MySqlParser#untilOption}.
	 * @param ctx the parse tree
	 */
	void enterSqlGapsUntilOption(@NotNull MySqlParser.SqlGapsUntilOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sqlGapsUntilOption}
	 * labeled alternative in {@link MySqlParser#untilOption}.
	 * @param ctx the parse tree
	 */
	void exitSqlGapsUntilOption(@NotNull MySqlParser.SqlGapsUntilOptionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code alterByUpgradePartitioning}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByUpgradePartitioning(@NotNull MySqlParser.AlterByUpgradePartitioningContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByUpgradePartitioning}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByUpgradePartitioning(@NotNull MySqlParser.AlterByUpgradePartitioningContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#flushTableOption}.
	 * @param ctx the parse tree
	 */
	void enterFlushTableOption(@NotNull MySqlParser.FlushTableOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#flushTableOption}.
	 * @param ctx the parse tree
	 */
	void exitFlushTableOption(@NotNull MySqlParser.FlushTableOptionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#xaRecoverWork}.
	 * @param ctx the parse tree
	 */
	void enterXaRecoverWork(@NotNull MySqlParser.XaRecoverWorkContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#xaRecoverWork}.
	 * @param ctx the parse tree
	 */
	void exitXaRecoverWork(@NotNull MySqlParser.XaRecoverWorkContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(@NotNull MySqlParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(@NotNull MySqlParser.OrderByClauseContext ctx);

	/**
	 * Enter a parse tree produced by the {@code alterByDropColumn}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDropColumn(@NotNull MySqlParser.AlterByDropColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDropColumn}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDropColumn(@NotNull MySqlParser.AlterByDropColumnContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#createLogfileGroup}.
	 * @param ctx the parse tree
	 */
	void enterCreateLogfileGroup(@NotNull MySqlParser.CreateLogfileGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#createLogfileGroup}.
	 * @param ctx the parse tree
	 */
	void exitCreateLogfileGroup(@NotNull MySqlParser.CreateLogfileGroupContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#rollbackStatement}.
	 * @param ctx the parse tree
	 */
	void enterRollbackStatement(@NotNull MySqlParser.RollbackStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#rollbackStatement}.
	 * @param ctx the parse tree
	 */
	void exitRollbackStatement(@NotNull MySqlParser.RollbackStatementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code innerJoin}
	 * labeled alternative in {@link MySqlParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void enterInnerJoin(@NotNull MySqlParser.InnerJoinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code innerJoin}
	 * labeled alternative in {@link MySqlParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void exitInnerJoin(@NotNull MySqlParser.InnerJoinContext ctx);

	/**
	 * Enter a parse tree produced by the {@code unaryExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionAtom(@NotNull MySqlParser.UnaryExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionAtom(@NotNull MySqlParser.UnaryExpressionAtomContext ctx);

	/**
	 * Enter a parse tree produced by the {@code partitionOptionIndexDirectory}
	 * labeled alternative in {@link MySqlParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void enterPartitionOptionIndexDirectory(@NotNull MySqlParser.PartitionOptionIndexDirectoryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionOptionIndexDirectory}
	 * labeled alternative in {@link MySqlParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void exitPartitionOptionIndexDirectory(@NotNull MySqlParser.PartitionOptionIndexDirectoryContext ctx);

	/**
	 * Enter a parse tree produced by the {@code showCreateFullIdObject}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateFullIdObject(@NotNull MySqlParser.ShowCreateFullIdObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCreateFullIdObject}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateFullIdObject(@NotNull MySqlParser.ShowCreateFullIdObjectContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#grantStatement}.
	 * @param ctx the parse tree
	 */
	void enterGrantStatement(@NotNull MySqlParser.GrantStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#grantStatement}.
	 * @param ctx the parse tree
	 */
	void exitGrantStatement(@NotNull MySqlParser.GrantStatementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code masterUidListOption}
	 * labeled alternative in {@link MySqlParser#masterOption}.
	 * @param ctx the parse tree
	 */
	void enterMasterUidListOption(@NotNull MySqlParser.MasterUidListOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code masterUidListOption}
	 * labeled alternative in {@link MySqlParser#masterOption}.
	 * @param ctx the parse tree
	 */
	void exitMasterUidListOption(@NotNull MySqlParser.MasterUidListOptionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#scalarFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterScalarFunctionName(@NotNull MySqlParser.ScalarFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#scalarFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitScalarFunctionName(@NotNull MySqlParser.ScalarFunctionNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#shutdownStatement}.
	 * @param ctx the parse tree
	 */
	void enterShutdownStatement(@NotNull MySqlParser.ShutdownStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#shutdownStatement}.
	 * @param ctx the parse tree
	 */
	void exitShutdownStatement(@NotNull MySqlParser.ShutdownStatementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code currentSchemaPriviLevel}
	 * labeled alternative in {@link MySqlParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void enterCurrentSchemaPriviLevel(@NotNull MySqlParser.CurrentSchemaPriviLevelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code currentSchemaPriviLevel}
	 * labeled alternative in {@link MySqlParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void exitCurrentSchemaPriviLevel(@NotNull MySqlParser.CurrentSchemaPriviLevelContext ctx);

	/**
	 * Enter a parse tree produced by the {@code wildIgnoreTableReplication}
	 * labeled alternative in {@link MySqlParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void enterWildIgnoreTableReplication(@NotNull MySqlParser.WildIgnoreTableReplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wildIgnoreTableReplication}
	 * labeled alternative in {@link MySqlParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void exitWildIgnoreTableReplication(@NotNull MySqlParser.WildIgnoreTableReplicationContext ctx);

	/**
	 * Enter a parse tree produced by the {@code tableOptionRowFormat}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionRowFormat(@NotNull MySqlParser.TableOptionRowFormatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionRowFormat}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionRowFormat(@NotNull MySqlParser.TableOptionRowFormatContext ctx);

	/**
	 * Enter a parse tree produced by the {@code doTableReplication}
	 * labeled alternative in {@link MySqlParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void enterDoTableReplication(@NotNull MySqlParser.DoTableReplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doTableReplication}
	 * labeled alternative in {@link MySqlParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void exitDoTableReplication(@NotNull MySqlParser.DoTableReplicationContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#dataTypeBase}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeBase(@NotNull MySqlParser.DataTypeBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#dataTypeBase}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeBase(@NotNull MySqlParser.DataTypeBaseContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#alterEvent}.
	 * @param ctx the parse tree
	 */
	void enterAlterEvent(@NotNull MySqlParser.AlterEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#alterEvent}.
	 * @param ctx the parse tree
	 */
	void exitAlterEvent(@NotNull MySqlParser.AlterEventContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#multipleDeleteStatement}.
	 * @param ctx the parse tree
	 */
	void enterMultipleDeleteStatement(@NotNull MySqlParser.MultipleDeleteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#multipleDeleteStatement}.
	 * @param ctx the parse tree
	 */
	void exitMultipleDeleteStatement(@NotNull MySqlParser.MultipleDeleteStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#selectFieldsInto}.
	 * @param ctx the parse tree
	 */
	void enterSelectFieldsInto(@NotNull MySqlParser.SelectFieldsIntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#selectFieldsInto}.
	 * @param ctx the parse tree
	 */
	void exitSelectFieldsInto(@NotNull MySqlParser.SelectFieldsIntoContext ctx);

	/**
	 * Enter a parse tree produced by the {@code showOpenTables}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowOpenTables(@NotNull MySqlParser.ShowOpenTablesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showOpenTables}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowOpenTables(@NotNull MySqlParser.ShowOpenTablesContext ctx);

	/**
	 * Enter a parse tree produced by the {@code simpleSelect}
	 * labeled alternative in {@link MySqlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleSelect(@NotNull MySqlParser.SimpleSelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleSelect}
	 * labeled alternative in {@link MySqlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleSelect(@NotNull MySqlParser.SimpleSelectContext ctx);

	/**
	 * Enter a parse tree produced by the {@code betweenPredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterBetweenPredicate(@NotNull MySqlParser.BetweenPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code betweenPredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitBetweenPredicate(@NotNull MySqlParser.BetweenPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#xaEndTransaction}.
	 * @param ctx the parse tree
	 */
	void enterXaEndTransaction(@NotNull MySqlParser.XaEndTransactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#xaEndTransaction}.
	 * @param ctx the parse tree
	 */
	void exitXaEndTransaction(@NotNull MySqlParser.XaEndTransactionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#handlerOpenStatement}.
	 * @param ctx the parse tree
	 */
	void enterHandlerOpenStatement(@NotNull MySqlParser.HandlerOpenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#handlerOpenStatement}.
	 * @param ctx the parse tree
	 */
	void exitHandlerOpenStatement(@NotNull MySqlParser.HandlerOpenStatementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code straightJoin}
	 * labeled alternative in {@link MySqlParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void enterStraightJoin(@NotNull MySqlParser.StraightJoinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code straightJoin}
	 * labeled alternative in {@link MySqlParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void exitStraightJoin(@NotNull MySqlParser.StraightJoinContext ctx);

	/**
	 * Enter a parse tree produced by the {@code tableOptionUnion}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionUnion(@NotNull MySqlParser.TableOptionUnionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionUnion}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionUnion(@NotNull MySqlParser.TableOptionUnionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code alterByImportTablespace}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByImportTablespace(@NotNull MySqlParser.AlterByImportTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByImportTablespace}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByImportTablespace(@NotNull MySqlParser.AlterByImportTablespaceContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#uid}.
	 * @param ctx the parse tree
	 */
	void enterUid(@NotNull MySqlParser.UidContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#uid}.
	 * @param ctx the parse tree
	 */
	void exitUid(@NotNull MySqlParser.UidContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#referenceAction}.
	 * @param ctx the parse tree
	 */
	void enterReferenceAction(@NotNull MySqlParser.ReferenceActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#referenceAction}.
	 * @param ctx the parse tree
	 */
	void exitReferenceAction(@NotNull MySqlParser.ReferenceActionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#alterInstance}.
	 * @param ctx the parse tree
	 */
	void enterAlterInstance(@NotNull MySqlParser.AlterInstanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#alterInstance}.
	 * @param ctx the parse tree
	 */
	void exitAlterInstance(@NotNull MySqlParser.AlterInstanceContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#createDefinitions}.
	 * @param ctx the parse tree
	 */
	void enterCreateDefinitions(@NotNull MySqlParser.CreateDefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#createDefinitions}.
	 * @param ctx the parse tree
	 */
	void exitCreateDefinitions(@NotNull MySqlParser.CreateDefinitionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#loadedTableIndexes}.
	 * @param ctx the parse tree
	 */
	void enterLoadedTableIndexes(@NotNull MySqlParser.LoadedTableIndexesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#loadedTableIndexes}.
	 * @param ctx the parse tree
	 */
	void exitLoadedTableIndexes(@NotNull MySqlParser.LoadedTableIndexesContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#commitWork}.
	 * @param ctx the parse tree
	 */
	void enterCommitWork(@NotNull MySqlParser.CommitWorkContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#commitWork}.
	 * @param ctx the parse tree
	 */
	void exitCommitWork(@NotNull MySqlParser.CommitWorkContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#createView}.
	 * @param ctx the parse tree
	 */
	void enterCreateView(@NotNull MySqlParser.CreateViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#createView}.
	 * @param ctx the parse tree
	 */
	void exitCreateView(@NotNull MySqlParser.CreateViewContext ctx);

	/**
	 * Enter a parse tree produced by the {@code routineData}
	 * labeled alternative in {@link MySqlParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void enterRoutineData(@NotNull MySqlParser.RoutineDataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code routineData}
	 * labeled alternative in {@link MySqlParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void exitRoutineData(@NotNull MySqlParser.RoutineDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#elifAlternative}.
	 * @param ctx the parse tree
	 */
	void enterElifAlternative(@NotNull MySqlParser.ElifAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#elifAlternative}.
	 * @param ctx the parse tree
	 */
	void exitElifAlternative(@NotNull MySqlParser.ElifAlternativeContext ctx);

	/**
	 * Enter a parse tree produced by the {@code simpleDataType}
	 * labeled alternative in {@link MySqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterSimpleDataType(@NotNull MySqlParser.SimpleDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleDataType}
	 * labeled alternative in {@link MySqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitSimpleDataType(@NotNull MySqlParser.SimpleDataTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#orderByExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrderByExpression(@NotNull MySqlParser.OrderByExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#orderByExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrderByExpression(@NotNull MySqlParser.OrderByExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#indexColumnName}.
	 * @param ctx the parse tree
	 */
	void enterIndexColumnName(@NotNull MySqlParser.IndexColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#indexColumnName}.
	 * @param ctx the parse tree
	 */
	void exitIndexColumnName(@NotNull MySqlParser.IndexColumnNameContext ctx);

	/**
	 * Enter a parse tree produced by the {@code alterByChangeDefault}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByChangeDefault(@NotNull MySqlParser.AlterByChangeDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByChangeDefault}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByChangeDefault(@NotNull MySqlParser.AlterByChangeDefaultContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#passwordFunctionClause}.
	 * @param ctx the parse tree
	 */
	void enterPasswordFunctionClause(@NotNull MySqlParser.PasswordFunctionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#passwordFunctionClause}.
	 * @param ctx the parse tree
	 */
	void exitPasswordFunctionClause(@NotNull MySqlParser.PasswordFunctionClauseContext ctx);

	/**
	 * Enter a parse tree produced by the {@code doDbReplication}
	 * labeled alternative in {@link MySqlParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void enterDoDbReplication(@NotNull MySqlParser.DoDbReplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doDbReplication}
	 * labeled alternative in {@link MySqlParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void exitDoDbReplication(@NotNull MySqlParser.DoDbReplicationContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#administrationStatement}.
	 * @param ctx the parse tree
	 */
	void enterAdministrationStatement(@NotNull MySqlParser.AdministrationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#administrationStatement}.
	 * @param ctx the parse tree
	 */
	void exitAdministrationStatement(@NotNull MySqlParser.AdministrationStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#createIndex}.
	 * @param ctx the parse tree
	 */
	void enterCreateIndex(@NotNull MySqlParser.CreateIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#createIndex}.
	 * @param ctx the parse tree
	 */
	void exitCreateIndex(@NotNull MySqlParser.CreateIndexContext ctx);

	/**
	 * Enter a parse tree produced by the {@code valuesFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterValuesFunctionCall(@NotNull MySqlParser.ValuesFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valuesFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitValuesFunctionCall(@NotNull MySqlParser.ValuesFunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#uuidSet}.
	 * @param ctx the parse tree
	 */
	void enterUuidSet(@NotNull MySqlParser.UuidSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#uuidSet}.
	 * @param ctx the parse tree
	 */
	void exitUuidSet(@NotNull MySqlParser.UuidSetContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#analyzeTable}.
	 * @param ctx the parse tree
	 */
	void enterAnalyzeTable(@NotNull MySqlParser.AnalyzeTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#analyzeTable}.
	 * @param ctx the parse tree
	 */
	void exitAnalyzeTable(@NotNull MySqlParser.AnalyzeTableContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#ifExists}.
	 * @param ctx the parse tree
	 */
	void enterIfExists(@NotNull MySqlParser.IfExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#ifExists}.
	 * @param ctx the parse tree
	 */
	void exitIfExists(@NotNull MySqlParser.IfExistsContext ctx);

	/**
	 * Enter a parse tree produced by the {@code alterByDefaultCharset}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDefaultCharset(@NotNull MySqlParser.AlterByDefaultCharsetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDefaultCharset}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDefaultCharset(@NotNull MySqlParser.AlterByDefaultCharsetContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(@NotNull MySqlParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(@NotNull MySqlParser.CompoundStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#renameTable}.
	 * @param ctx the parse tree
	 */
	void enterRenameTable(@NotNull MySqlParser.RenameTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#renameTable}.
	 * @param ctx the parse tree
	 */
	void exitRenameTable(@NotNull MySqlParser.RenameTableContext ctx);

	/**
	 * Enter a parse tree produced by the {@code extractFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterExtractFunctionCall(@NotNull MySqlParser.ExtractFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code extractFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitExtractFunctionCall(@NotNull MySqlParser.ExtractFunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#boolMasterOption}.
	 * @param ctx the parse tree
	 */
	void enterBoolMasterOption(@NotNull MySqlParser.BoolMasterOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#boolMasterOption}.
	 * @param ctx the parse tree
	 */
	void exitBoolMasterOption(@NotNull MySqlParser.BoolMasterOptionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#alterServer}.
	 * @param ctx the parse tree
	 */
	void enterAlterServer(@NotNull MySqlParser.AlterServerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#alterServer}.
	 * @param ctx the parse tree
	 */
	void exitAlterServer(@NotNull MySqlParser.AlterServerContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#alterTablespace}.
	 * @param ctx the parse tree
	 */
	void enterAlterTablespace(@NotNull MySqlParser.AlterTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#alterTablespace}.
	 * @param ctx the parse tree
	 */
	void exitAlterTablespace(@NotNull MySqlParser.AlterTablespaceContext ctx);

	/**
	 * Enter a parse tree produced by the {@code alterByRename}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByRename(@NotNull MySqlParser.AlterByRenameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByRename}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByRename(@NotNull MySqlParser.AlterByRenameContext ctx);

	/**
	 * Enter a parse tree produced by the {@code spatialDataType}
	 * labeled alternative in {@link MySqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterSpatialDataType(@NotNull MySqlParser.SpatialDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code spatialDataType}
	 * labeled alternative in {@link MySqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitSpatialDataType(@NotNull MySqlParser.SpatialDataTypeContext ctx);

	/**
	 * Enter a parse tree produced by the {@code alterByCoalescePartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByCoalescePartition(@NotNull MySqlParser.AlterByCoalescePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByCoalescePartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByCoalescePartition(@NotNull MySqlParser.AlterByCoalescePartitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#gtuidSet}.
	 * @param ctx the parse tree
	 */
	void enterGtuidSet(@NotNull MySqlParser.GtuidSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#gtuidSet}.
	 * @param ctx the parse tree
	 */
	void exitGtuidSet(@NotNull MySqlParser.GtuidSetContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#partitionDefinitions}.
	 * @param ctx the parse tree
	 */
	void enterPartitionDefinitions(@NotNull MySqlParser.PartitionDefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#partitionDefinitions}.
	 * @param ctx the parse tree
	 */
	void exitPartitionDefinitions(@NotNull MySqlParser.PartitionDefinitionsContext ctx);

	/**
	 * Enter a parse tree produced by the {@code bitExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterBitExpressionAtom(@NotNull MySqlParser.BitExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitBitExpressionAtom(@NotNull MySqlParser.BitExpressionAtomContext ctx);

	/**
	 * Enter a parse tree produced by the {@code showSlaveStatus}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowSlaveStatus(@NotNull MySqlParser.ShowSlaveStatusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showSlaveStatus}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowSlaveStatus(@NotNull MySqlParser.ShowSlaveStatusContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(@NotNull MySqlParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(@NotNull MySqlParser.BooleanLiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#replaceStatement}.
	 * @param ctx the parse tree
	 */
	void enterReplaceStatement(@NotNull MySqlParser.ReplaceStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#replaceStatement}.
	 * @param ctx the parse tree
	 */
	void exitReplaceStatement(@NotNull MySqlParser.ReplaceStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#handlerReadIndexStatement}.
	 * @param ctx the parse tree
	 */
	void enterHandlerReadIndexStatement(@NotNull MySqlParser.HandlerReadIndexStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#handlerReadIndexStatement}.
	 * @param ctx the parse tree
	 */
	void exitHandlerReadIndexStatement(@NotNull MySqlParser.HandlerReadIndexStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#sqlStatement}.
	 * @param ctx the parse tree
	 */
	void enterSqlStatement(@NotNull MySqlParser.SqlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#sqlStatement}.
	 * @param ctx the parse tree
	 */
	void exitSqlStatement(@NotNull MySqlParser.SqlStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#functionArg}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArg(@NotNull MySqlParser.FunctionArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#functionArg}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArg(@NotNull MySqlParser.FunctionArgContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#convertedDataType}.
	 * @param ctx the parse tree
	 */
	void enterConvertedDataType(@NotNull MySqlParser.ConvertedDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#convertedDataType}.
	 * @param ctx the parse tree
	 */
	void exitConvertedDataType(@NotNull MySqlParser.ConvertedDataTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#useStatement}.
	 * @param ctx the parse tree
	 */
	void enterUseStatement(@NotNull MySqlParser.UseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#useStatement}.
	 * @param ctx the parse tree
	 */
	void exitUseStatement(@NotNull MySqlParser.UseStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#dottedId}.
	 * @param ctx the parse tree
	 */
	void enterDottedId(@NotNull MySqlParser.DottedIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#dottedId}.
	 * @param ctx the parse tree
	 */
	void exitDottedId(@NotNull MySqlParser.DottedIdContext ctx);

	/**
	 * Enter a parse tree produced by the {@code shortRevoke}
	 * labeled alternative in {@link MySqlParser#revokeStatement}.
	 * @param ctx the parse tree
	 */
	void enterShortRevoke(@NotNull MySqlParser.ShortRevokeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code shortRevoke}
	 * labeled alternative in {@link MySqlParser#revokeStatement}.
	 * @param ctx the parse tree
	 */
	void exitShortRevoke(@NotNull MySqlParser.ShortRevokeContext ctx);

	/**
	 * Enter a parse tree produced by the {@code caseFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterCaseFunctionCall(@NotNull MySqlParser.CaseFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code caseFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitCaseFunctionCall(@NotNull MySqlParser.CaseFunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by the {@code alterByCheckPartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByCheckPartition(@NotNull MySqlParser.AlterByCheckPartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByCheckPartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByCheckPartition(@NotNull MySqlParser.AlterByCheckPartitionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code routineBehavior}
	 * labeled alternative in {@link MySqlParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void enterRoutineBehavior(@NotNull MySqlParser.RoutineBehaviorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code routineBehavior}
	 * labeled alternative in {@link MySqlParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void exitRoutineBehavior(@NotNull MySqlParser.RoutineBehaviorContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#userLockOption}.
	 * @param ctx the parse tree
	 */
	void enterUserLockOption(@NotNull MySqlParser.UserLockOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#userLockOption}.
	 * @param ctx the parse tree
	 */
	void exitUserLockOption(@NotNull MySqlParser.UserLockOptionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code handlerConditionException}
	 * labeled alternative in {@link MySqlParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void enterHandlerConditionException(@NotNull MySqlParser.HandlerConditionExceptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code handlerConditionException}
	 * labeled alternative in {@link MySqlParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void exitHandlerConditionException(@NotNull MySqlParser.HandlerConditionExceptionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#transactionLevelBase}.
	 * @param ctx the parse tree
	 */
	void enterTransactionLevelBase(@NotNull MySqlParser.TransactionLevelBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#transactionLevelBase}.
	 * @param ctx the parse tree
	 */
	void exitTransactionLevelBase(@NotNull MySqlParser.TransactionLevelBaseContext ctx);

	/**
	 * Enter a parse tree produced by the {@code subPartitionFunctionKey}
	 * labeled alternative in {@link MySqlParser#subpartitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSubPartitionFunctionKey(@NotNull MySqlParser.SubPartitionFunctionKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subPartitionFunctionKey}
	 * labeled alternative in {@link MySqlParser#subpartitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSubPartitionFunctionKey(@NotNull MySqlParser.SubPartitionFunctionKeyContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#fullId}.
	 * @param ctx the parse tree
	 */
	void enterFullId(@NotNull MySqlParser.FullIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#fullId}.
	 * @param ctx the parse tree
	 */
	void exitFullId(@NotNull MySqlParser.FullIdContext ctx);

	/**
	 * Enter a parse tree produced by the {@code handlerConditionName}
	 * labeled alternative in {@link MySqlParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void enterHandlerConditionName(@NotNull MySqlParser.HandlerConditionNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code handlerConditionName}
	 * labeled alternative in {@link MySqlParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void exitHandlerConditionName(@NotNull MySqlParser.HandlerConditionNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#renameUserClause}.
	 * @param ctx the parse tree
	 */
	void enterRenameUserClause(@NotNull MySqlParser.RenameUserClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#renameUserClause}.
	 * @param ctx the parse tree
	 */
	void exitRenameUserClause(@NotNull MySqlParser.RenameUserClauseContext ctx);

	/**
	 * Enter a parse tree produced by the {@code tableFlushOption}
	 * labeled alternative in {@link MySqlParser#flushOption}.
	 * @param ctx the parse tree
	 */
	void enterTableFlushOption(@NotNull MySqlParser.TableFlushOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableFlushOption}
	 * labeled alternative in {@link MySqlParser#flushOption}.
	 * @param ctx the parse tree
	 */
	void exitTableFlushOption(@NotNull MySqlParser.TableFlushOptionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code tableOptionMaxRows}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionMaxRows(@NotNull MySqlParser.TableOptionMaxRowsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionMaxRows}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionMaxRows(@NotNull MySqlParser.TableOptionMaxRowsContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#dropFunction}.
	 * @param ctx the parse tree
	 */
	void enterDropFunction(@NotNull MySqlParser.DropFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#dropFunction}.
	 * @param ctx the parse tree
	 */
	void exitDropFunction(@NotNull MySqlParser.DropFunctionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code partitionOptionDataDirectory}
	 * labeled alternative in {@link MySqlParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void enterPartitionOptionDataDirectory(@NotNull MySqlParser.PartitionOptionDataDirectoryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionOptionDataDirectory}
	 * labeled alternative in {@link MySqlParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void exitPartitionOptionDataDirectory(@NotNull MySqlParser.PartitionOptionDataDirectoryContext ctx);

	/**
	 * Enter a parse tree produced by the {@code alterByAddForeignKey}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAddForeignKey(@NotNull MySqlParser.AlterByAddForeignKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAddForeignKey}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAddForeignKey(@NotNull MySqlParser.AlterByAddForeignKeyContext ctx);

	/**
	 * Enter a parse tree produced by the {@code nestedExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterNestedExpressionAtom(@NotNull MySqlParser.NestedExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nestedExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitNestedExpressionAtom(@NotNull MySqlParser.NestedExpressionAtomContext ctx);

	/**
	 * Enter a parse tree produced by the {@code alterByRemovePartitioning}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByRemovePartitioning(@NotNull MySqlParser.AlterByRemovePartitioningContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByRemovePartitioning}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByRemovePartitioning(@NotNull MySqlParser.AlterByRemovePartitioningContext ctx);

	/**
	 * Enter a parse tree produced by the {@code tableOptionSamplePage}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionSamplePage(@NotNull MySqlParser.TableOptionSamplePageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionSamplePage}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionSamplePage(@NotNull MySqlParser.TableOptionSamplePageContext ctx);

	/**
	 * Enter a parse tree produced by the {@code tableOptionIndexDirectory}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionIndexDirectory(@NotNull MySqlParser.TableOptionIndexDirectoryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionIndexDirectory}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionIndexDirectory(@NotNull MySqlParser.TableOptionIndexDirectoryContext ctx);

	/**
	 * Enter a parse tree produced by the {@code passwordFunctionCall}
	 * labeled alternative in {@link MySqlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterPasswordFunctionCall(@NotNull MySqlParser.PasswordFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code passwordFunctionCall}
	 * labeled alternative in {@link MySqlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitPasswordFunctionCall(@NotNull MySqlParser.PasswordFunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(@NotNull MySqlParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(@NotNull MySqlParser.RootContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#caseAlternative}.
	 * @param ctx the parse tree
	 */
	void enterCaseAlternative(@NotNull MySqlParser.CaseAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#caseAlternative}.
	 * @param ctx the parse tree
	 */
	void exitCaseAlternative(@NotNull MySqlParser.CaseAlternativeContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#lengthOneDimension}.
	 * @param ctx the parse tree
	 */
	void enterLengthOneDimension(@NotNull MySqlParser.LengthOneDimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#lengthOneDimension}.
	 * @param ctx the parse tree
	 */
	void exitLengthOneDimension(@NotNull MySqlParser.LengthOneDimensionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code regexpPredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterRegexpPredicate(@NotNull MySqlParser.RegexpPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code regexpPredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitRegexpPredicate(@NotNull MySqlParser.RegexpPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#setPasswordStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetPasswordStatement(@NotNull MySqlParser.SetPasswordStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#setPasswordStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetPasswordStatement(@NotNull MySqlParser.SetPasswordStatementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code alterByForce}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByForce(@NotNull MySqlParser.AlterByForceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByForce}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByForce(@NotNull MySqlParser.AlterByForceContext ctx);

	/**
	 * Enter a parse tree produced by the {@code setVariable}
	 * labeled alternative in {@link MySqlParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetVariable(@NotNull MySqlParser.SetVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setVariable}
	 * labeled alternative in {@link MySqlParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetVariable(@NotNull MySqlParser.SetVariableContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(@NotNull MySqlParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(@NotNull MySqlParser.LoopStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#userName}.
	 * @param ctx the parse tree
	 */
	void enterUserName(@NotNull MySqlParser.UserNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#userName}.
	 * @param ctx the parse tree
	 */
	void exitUserName(@NotNull MySqlParser.UserNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#createTablespaceInnodb}.
	 * @param ctx the parse tree
	 */
	void enterCreateTablespaceInnodb(@NotNull MySqlParser.CreateTablespaceInnodbContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#createTablespaceInnodb}.
	 * @param ctx the parse tree
	 */
	void exitCreateTablespaceInnodb(@NotNull MySqlParser.CreateTablespaceInnodbContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#killStatement}.
	 * @param ctx the parse tree
	 */
	void enterKillStatement(@NotNull MySqlParser.KillStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#killStatement}.
	 * @param ctx the parse tree
	 */
	void exitKillStatement(@NotNull MySqlParser.KillStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#indexType}.
	 * @param ctx the parse tree
	 */
	void enterIndexType(@NotNull MySqlParser.IndexTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#indexType}.
	 * @param ctx the parse tree
	 */
	void exitIndexType(@NotNull MySqlParser.IndexTypeContext ctx);

	/**
	 * Enter a parse tree produced by the {@code gtidsUntilOption}
	 * labeled alternative in {@link MySqlParser#untilOption}.
	 * @param ctx the parse tree
	 */
	void enterGtidsUntilOption(@NotNull MySqlParser.GtidsUntilOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gtidsUntilOption}
	 * labeled alternative in {@link MySqlParser#untilOption}.
	 * @param ctx the parse tree
	 */
	void exitGtidsUntilOption(@NotNull MySqlParser.GtidsUntilOptionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code partitionOptionMaxRows}
	 * labeled alternative in {@link MySqlParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void enterPartitionOptionMaxRows(@NotNull MySqlParser.PartitionOptionMaxRowsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionOptionMaxRows}
	 * labeled alternative in {@link MySqlParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void exitPartitionOptionMaxRows(@NotNull MySqlParser.PartitionOptionMaxRowsContext ctx);

	/**
	 * Enter a parse tree produced by the {@code alterByChangeColumn}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByChangeColumn(@NotNull MySqlParser.AlterByChangeColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByChangeColumn}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByChangeColumn(@NotNull MySqlParser.AlterByChangeColumnContext ctx);

	/**
	 * Enter a parse tree produced by the {@code alterByTruncatePartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByTruncatePartition(@NotNull MySqlParser.AlterByTruncatePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByTruncatePartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByTruncatePartition(@NotNull MySqlParser.AlterByTruncatePartitionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code fullColumnNameExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterFullColumnNameExpressionAtom(@NotNull MySqlParser.FullColumnNameExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fullColumnNameExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitFullColumnNameExpressionAtom(@NotNull MySqlParser.FullColumnNameExpressionAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#functionParameter}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameter(@NotNull MySqlParser.FunctionParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#functionParameter}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameter(@NotNull MySqlParser.FunctionParameterContext ctx);

	/**
	 * Enter a parse tree produced by the {@code scalarFunctionCall}
	 * labeled alternative in {@link MySqlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterScalarFunctionCall(@NotNull MySqlParser.ScalarFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scalarFunctionCall}
	 * labeled alternative in {@link MySqlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitScalarFunctionCall(@NotNull MySqlParser.ScalarFunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#subpartitionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSubpartitionDefinition(@NotNull MySqlParser.SubpartitionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#subpartitionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSubpartitionDefinition(@NotNull MySqlParser.SubpartitionDefinitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#renameTableClause}.
	 * @param ctx the parse tree
	 */
	void enterRenameTableClause(@NotNull MySqlParser.RenameTableClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#renameTableClause}.
	 * @param ctx the parse tree
	 */
	void exitRenameTableClause(@NotNull MySqlParser.RenameTableClauseContext ctx);

	/**
	 * Enter a parse tree produced by the {@code isExpression}
	 * labeled alternative in {@link MySqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIsExpression(@NotNull MySqlParser.IsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isExpression}
	 * labeled alternative in {@link MySqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIsExpression(@NotNull MySqlParser.IsExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#changeMaster}.
	 * @param ctx the parse tree
	 */
	void enterChangeMaster(@NotNull MySqlParser.ChangeMasterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#changeMaster}.
	 * @param ctx the parse tree
	 */
	void exitChangeMaster(@NotNull MySqlParser.ChangeMasterContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#preparedStatement}.
	 * @param ctx the parse tree
	 */
	void enterPreparedStatement(@NotNull MySqlParser.PreparedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#preparedStatement}.
	 * @param ctx the parse tree
	 */
	void exitPreparedStatement(@NotNull MySqlParser.PreparedStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#tablespaceStorage}.
	 * @param ctx the parse tree
	 */
	void enterTablespaceStorage(@NotNull MySqlParser.TablespaceStorageContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#tablespaceStorage}.
	 * @param ctx the parse tree
	 */
	void exitTablespaceStorage(@NotNull MySqlParser.TablespaceStorageContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterColumnDefinition(@NotNull MySqlParser.ColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitColumnDefinition(@NotNull MySqlParser.ColumnDefinitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#resetStatement}.
	 * @param ctx the parse tree
	 */
	void enterResetStatement(@NotNull MySqlParser.ResetStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#resetStatement}.
	 * @param ctx the parse tree
	 */
	void exitResetStatement(@NotNull MySqlParser.ResetStatementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code partitionSimple}
	 * labeled alternative in {@link MySqlParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartitionSimple(@NotNull MySqlParser.PartitionSimpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionSimple}
	 * labeled alternative in {@link MySqlParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartitionSimple(@NotNull MySqlParser.PartitionSimpleContext ctx);

	/**
	 * Enter a parse tree produced by the {@code showCreateDb}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateDb(@NotNull MySqlParser.ShowCreateDbContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCreateDb}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateDb(@NotNull MySqlParser.ShowCreateDbContext ctx);

	/**
	 * Enter a parse tree produced by the {@code partitionFunctionKey}
	 * labeled alternative in {@link MySqlParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartitionFunctionKey(@NotNull MySqlParser.PartitionFunctionKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionFunctionKey}
	 * labeled alternative in {@link MySqlParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartitionFunctionKey(@NotNull MySqlParser.PartitionFunctionKeyContext ctx);

	/**
	 * Enter a parse tree produced by the {@code describeStatements}
	 * labeled alternative in {@link MySqlParser#describeObjectClause}.
	 * @param ctx the parse tree
	 */
	void enterDescribeStatements(@NotNull MySqlParser.DescribeStatementsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeStatements}
	 * labeled alternative in {@link MySqlParser#describeObjectClause}.
	 * @param ctx the parse tree
	 */
	void exitDescribeStatements(@NotNull MySqlParser.DescribeStatementsContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#tables}.
	 * @param ctx the parse tree
	 */
	void enterTables(@NotNull MySqlParser.TablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#tables}.
	 * @param ctx the parse tree
	 */
	void exitTables(@NotNull MySqlParser.TablesContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#expressionOrDefault}.
	 * @param ctx the parse tree
	 */
	void enterExpressionOrDefault(@NotNull MySqlParser.ExpressionOrDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#expressionOrDefault}.
	 * @param ctx the parse tree
	 */
	void exitExpressionOrDefault(@NotNull MySqlParser.ExpressionOrDefaultContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#showCommonEntity}.
	 * @param ctx the parse tree
	 */
	void enterShowCommonEntity(@NotNull MySqlParser.ShowCommonEntityContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#showCommonEntity}.
	 * @param ctx the parse tree
	 */
	void exitShowCommonEntity(@NotNull MySqlParser.ShowCommonEntityContext ctx);

	/**
	 * Enter a parse tree produced by the {@code masterLogUntilOption}
	 * labeled alternative in {@link MySqlParser#untilOption}.
	 * @param ctx the parse tree
	 */
	void enterMasterLogUntilOption(@NotNull MySqlParser.MasterLogUntilOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code masterLogUntilOption}
	 * labeled alternative in {@link MySqlParser#untilOption}.
	 * @param ctx the parse tree
	 */
	void exitMasterLogUntilOption(@NotNull MySqlParser.MasterLogUntilOptionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#xaPrepareStatement}.
	 * @param ctx the parse tree
	 */
	void enterXaPrepareStatement(@NotNull MySqlParser.XaPrepareStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#xaPrepareStatement}.
	 * @param ctx the parse tree
	 */
	void exitXaPrepareStatement(@NotNull MySqlParser.XaPrepareStatementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code definiteFullTablePrivLevel}
	 * labeled alternative in {@link MySqlParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void enterDefiniteFullTablePrivLevel(@NotNull MySqlParser.DefiniteFullTablePrivLevelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code definiteFullTablePrivLevel}
	 * labeled alternative in {@link MySqlParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void exitDefiniteFullTablePrivLevel(@NotNull MySqlParser.DefiniteFullTablePrivLevelContext ctx);

	/**
	 * Enter a parse tree produced by the {@code simpleFlushOption}
	 * labeled alternative in {@link MySqlParser#flushOption}.
	 * @param ctx the parse tree
	 */
	void enterSimpleFlushOption(@NotNull MySqlParser.SimpleFlushOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleFlushOption}
	 * labeled alternative in {@link MySqlParser#flushOption}.
	 * @param ctx the parse tree
	 */
	void exitSimpleFlushOption(@NotNull MySqlParser.SimpleFlushOptionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#dropProcedure}.
	 * @param ctx the parse tree
	 */
	void enterDropProcedure(@NotNull MySqlParser.DropProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#dropProcedure}.
	 * @param ctx the parse tree
	 */
	void exitDropProcedure(@NotNull MySqlParser.DropProcedureContext ctx);

	/**
	 * Enter a parse tree produced by the {@code alterByAddSpecialIndex}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAddSpecialIndex(@NotNull MySqlParser.AlterByAddSpecialIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAddSpecialIndex}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAddSpecialIndex(@NotNull MySqlParser.AlterByAddSpecialIndexContext ctx);

	/**
	 * Enter a parse tree produced by the {@code tableOptionChecksum}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionChecksum(@NotNull MySqlParser.TableOptionChecksumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionChecksum}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionChecksum(@NotNull MySqlParser.TableOptionChecksumContext ctx);

	/**
	 * Enter a parse tree produced by the {@code rewriteDbReplication}
	 * labeled alternative in {@link MySqlParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void enterRewriteDbReplication(@NotNull MySqlParser.RewriteDbReplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rewriteDbReplication}
	 * labeled alternative in {@link MySqlParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void exitRewriteDbReplication(@NotNull MySqlParser.RewriteDbReplicationContext ctx);

	/**
	 * Enter a parse tree produced by the {@code subqueryComparasionPredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryComparasionPredicate(@NotNull MySqlParser.SubqueryComparasionPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subqueryComparasionPredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryComparasionPredicate(@NotNull MySqlParser.SubqueryComparasionPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#callStatement}.
	 * @param ctx the parse tree
	 */
	void enterCallStatement(@NotNull MySqlParser.CallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#callStatement}.
	 * @param ctx the parse tree
	 */
	void exitCallStatement(@NotNull MySqlParser.CallStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#indexHintType}.
	 * @param ctx the parse tree
	 */
	void enterIndexHintType(@NotNull MySqlParser.IndexHintTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#indexHintType}.
	 * @param ctx the parse tree
	 */
	void exitIndexHintType(@NotNull MySqlParser.IndexHintTypeContext ctx);

	/**
	 * Enter a parse tree produced by the {@code selectIntoDumpFile}
	 * labeled alternative in {@link MySqlParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 */
	void enterSelectIntoDumpFile(@NotNull MySqlParser.SelectIntoDumpFileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectIntoDumpFile}
	 * labeled alternative in {@link MySqlParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 */
	void exitSelectIntoDumpFile(@NotNull MySqlParser.SelectIntoDumpFileContext ctx);

	/**
	 * Enter a parse tree produced by the {@code likePredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterLikePredicate(@NotNull MySqlParser.LikePredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code likePredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitLikePredicate(@NotNull MySqlParser.LikePredicateContext ctx);

	/**
	 * Enter a parse tree produced by the {@code alterByValidate}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByValidate(@NotNull MySqlParser.AlterByValidateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByValidate}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByValidate(@NotNull MySqlParser.AlterByValidateContext ctx);

	/**
	 * Enter a parse tree produced by the {@code setAutocommit}
	 * labeled alternative in {@link MySqlParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetAutocommit(@NotNull MySqlParser.SetAutocommitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setAutocommit}
	 * labeled alternative in {@link MySqlParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetAutocommit(@NotNull MySqlParser.SetAutocommitContext ctx);

	/**
	 * Enter a parse tree produced by the {@code CloseCursor}
	 * labeled alternative in {@link MySqlParser#cursorStatement}.
	 * @param ctx the parse tree
	 */
	void enterCloseCursor(@NotNull MySqlParser.CloseCursorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CloseCursor}
	 * labeled alternative in {@link MySqlParser#cursorStatement}.
	 * @param ctx the parse tree
	 */
	void exitCloseCursor(@NotNull MySqlParser.CloseCursorContext ctx);

	/**
	 * Enter a parse tree produced by the {@code partitionOptionTablespace}
	 * labeled alternative in {@link MySqlParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void enterPartitionOptionTablespace(@NotNull MySqlParser.PartitionOptionTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionOptionTablespace}
	 * labeled alternative in {@link MySqlParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void exitPartitionOptionTablespace(@NotNull MySqlParser.PartitionOptionTablespaceContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#updateStatement}.
	 * @param ctx the parse tree
	 */
	void enterUpdateStatement(@NotNull MySqlParser.UpdateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#updateStatement}.
	 * @param ctx the parse tree
	 */
	void exitUpdateStatement(@NotNull MySqlParser.UpdateStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#simpleDescribeStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleDescribeStatement(@NotNull MySqlParser.SimpleDescribeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#simpleDescribeStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleDescribeStatement(@NotNull MySqlParser.SimpleDescribeStatementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code columnDeclaration}
	 * labeled alternative in {@link MySqlParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void enterColumnDeclaration(@NotNull MySqlParser.ColumnDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnDeclaration}
	 * labeled alternative in {@link MySqlParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void exitColumnDeclaration(@NotNull MySqlParser.ColumnDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#helpStatement}.
	 * @param ctx the parse tree
	 */
	void enterHelpStatement(@NotNull MySqlParser.HelpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#helpStatement}.
	 * @param ctx the parse tree
	 */
	void exitHelpStatement(@NotNull MySqlParser.HelpStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#threadType}.
	 * @param ctx the parse tree
	 */
	void enterThreadType(@NotNull MySqlParser.ThreadTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#threadType}.
	 * @param ctx the parse tree
	 */
	void exitThreadType(@NotNull MySqlParser.ThreadTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#showSchemaEntity}.
	 * @param ctx the parse tree
	 */
	void enterShowSchemaEntity(@NotNull MySqlParser.ShowSchemaEntityContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#showSchemaEntity}.
	 * @param ctx the parse tree
	 */
	void exitShowSchemaEntity(@NotNull MySqlParser.ShowSchemaEntityContext ctx);

	/**
	 * Enter a parse tree produced by the {@code constraintDeclaration}
	 * labeled alternative in {@link MySqlParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstraintDeclaration(@NotNull MySqlParser.ConstraintDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constraintDeclaration}
	 * labeled alternative in {@link MySqlParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstraintDeclaration(@NotNull MySqlParser.ConstraintDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#charsetName}.
	 * @param ctx the parse tree
	 */
	void enterCharsetName(@NotNull MySqlParser.CharsetNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#charsetName}.
	 * @param ctx the parse tree
	 */
	void exitCharsetName(@NotNull MySqlParser.CharsetNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#renameUser}.
	 * @param ctx the parse tree
	 */
	void enterRenameUser(@NotNull MySqlParser.RenameUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#renameUser}.
	 * @param ctx the parse tree
	 */
	void exitRenameUser(@NotNull MySqlParser.RenameUserContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#partitionDefinerVector}.
	 * @param ctx the parse tree
	 */
	void enterPartitionDefinerVector(@NotNull MySqlParser.PartitionDefinerVectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#partitionDefinerVector}.
	 * @param ctx the parse tree
	 */
	void exitPartitionDefinerVector(@NotNull MySqlParser.PartitionDefinerVectorContext ctx);

	/**
	 * Enter a parse tree produced by the {@code alterUpgradeName}
	 * labeled alternative in {@link MySqlParser#alterDatabase}.
	 * @param ctx the parse tree
	 */
	void enterAlterUpgradeName(@NotNull MySqlParser.AlterUpgradeNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterUpgradeName}
	 * labeled alternative in {@link MySqlParser#alterDatabase}.
	 * @param ctx the parse tree
	 */
	void exitAlterUpgradeName(@NotNull MySqlParser.AlterUpgradeNameContext ctx);

	/**
	 * Enter a parse tree produced by the {@code selectIntoTextFile}
	 * labeled alternative in {@link MySqlParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 */
	void enterSelectIntoTextFile(@NotNull MySqlParser.SelectIntoTextFileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectIntoTextFile}
	 * labeled alternative in {@link MySqlParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 */
	void exitSelectIntoTextFile(@NotNull MySqlParser.SelectIntoTextFileContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#showProfileType}.
	 * @param ctx the parse tree
	 */
	void enterShowProfileType(@NotNull MySqlParser.ShowProfileTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#showProfileType}.
	 * @param ctx the parse tree
	 */
	void exitShowProfileType(@NotNull MySqlParser.ShowProfileTypeContext ctx);

	/**
	 * Enter a parse tree produced by the {@code dimensionDataType}
	 * labeled alternative in {@link MySqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDimensionDataType(@NotNull MySqlParser.DimensionDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dimensionDataType}
	 * labeled alternative in {@link MySqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDimensionDataType(@NotNull MySqlParser.DimensionDataTypeContext ctx);

	/**
	 * Enter a parse tree produced by the {@code alterByAddPartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAddPartition(@NotNull MySqlParser.AlterByAddPartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAddPartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAddPartition(@NotNull MySqlParser.AlterByAddPartitionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code showLogEvents}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowLogEvents(@NotNull MySqlParser.ShowLogEventsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showLogEvents}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowLogEvents(@NotNull MySqlParser.ShowLogEventsContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#createTablespaceNdb}.
	 * @param ctx the parse tree
	 */
	void enterCreateTablespaceNdb(@NotNull MySqlParser.CreateTablespaceNdbContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#createTablespaceNdb}.
	 * @param ctx the parse tree
	 */
	void exitCreateTablespaceNdb(@NotNull MySqlParser.CreateTablespaceNdbContext ctx);

	/**
	 * Enter a parse tree produced by the {@code alterByRebuildPartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByRebuildPartition(@NotNull MySqlParser.AlterByRebuildPartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByRebuildPartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByRebuildPartition(@NotNull MySqlParser.AlterByRebuildPartitionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code binaryExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpressionAtom(@NotNull MySqlParser.BinaryExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpressionAtom(@NotNull MySqlParser.BinaryExpressionAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#savepointStatement}.
	 * @param ctx the parse tree
	 */
	void enterSavepointStatement(@NotNull MySqlParser.SavepointStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#savepointStatement}.
	 * @param ctx the parse tree
	 */
	void exitSavepointStatement(@NotNull MySqlParser.SavepointStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#dropUser}.
	 * @param ctx the parse tree
	 */
	void enterDropUser(@NotNull MySqlParser.DropUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#dropUser}.
	 * @param ctx the parse tree
	 */
	void exitDropUser(@NotNull MySqlParser.DropUserContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(@NotNull MySqlParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(@NotNull MySqlParser.FromClauseContext ctx);

	/**
	 * Enter a parse tree produced by the {@code showCreateUser}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateUser(@NotNull MySqlParser.ShowCreateUserContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCreateUser}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateUser(@NotNull MySqlParser.ShowCreateUserContext ctx);

	/**
	 * Enter a parse tree produced by the {@code showObjectFilter}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowObjectFilter(@NotNull MySqlParser.ShowObjectFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showObjectFilter}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowObjectFilter(@NotNull MySqlParser.ShowObjectFilterContext ctx);

	/**
	 * Enter a parse tree produced by the {@code tableOptionComment}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionComment(@NotNull MySqlParser.TableOptionCommentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionComment}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionComment(@NotNull MySqlParser.TableOptionCommentContext ctx);

	/**
	 * Enter a parse tree produced by the {@code formatColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterFormatColumnConstraint(@NotNull MySqlParser.FormatColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formatColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitFormatColumnConstraint(@NotNull MySqlParser.FormatColumnConstraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#loadIndexIntoCache}.
	 * @param ctx the parse tree
	 */
	void enterLoadIndexIntoCache(@NotNull MySqlParser.LoadIndexIntoCacheContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#loadIndexIntoCache}.
	 * @param ctx the parse tree
	 */
	void exitLoadIndexIntoCache(@NotNull MySqlParser.LoadIndexIntoCacheContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(@NotNull MySqlParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(@NotNull MySqlParser.DoStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#userPasswordOption}.
	 * @param ctx the parse tree
	 */
	void enterUserPasswordOption(@NotNull MySqlParser.UserPasswordOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#userPasswordOption}.
	 * @param ctx the parse tree
	 */
	void exitUserPasswordOption(@NotNull MySqlParser.UserPasswordOptionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code routineLanguage}
	 * labeled alternative in {@link MySqlParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void enterRoutineLanguage(@NotNull MySqlParser.RoutineLanguageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code routineLanguage}
	 * labeled alternative in {@link MySqlParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void exitRoutineLanguage(@NotNull MySqlParser.RoutineLanguageContext ctx);

	/**
	 * Enter a parse tree produced by the {@code passwordAuthOption}
	 * labeled alternative in {@link MySqlParser#userAuthOption}.
	 * @param ctx the parse tree
	 */
	void enterPasswordAuthOption(@NotNull MySqlParser.PasswordAuthOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code passwordAuthOption}
	 * labeled alternative in {@link MySqlParser#userAuthOption}.
	 * @param ctx the parse tree
	 */
	void exitPasswordAuthOption(@NotNull MySqlParser.PasswordAuthOptionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code weightFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterWeightFunctionCall(@NotNull MySqlParser.WeightFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code weightFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitWeightFunctionCall(@NotNull MySqlParser.WeightFunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by the {@code aggregateFunctionCall}
	 * labeled alternative in {@link MySqlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterAggregateFunctionCall(@NotNull MySqlParser.AggregateFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aggregateFunctionCall}
	 * labeled alternative in {@link MySqlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitAggregateFunctionCall(@NotNull MySqlParser.AggregateFunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by the {@code selectStarElement}
	 * labeled alternative in {@link MySqlParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void enterSelectStarElement(@NotNull MySqlParser.SelectStarElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectStarElement}
	 * labeled alternative in {@link MySqlParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void exitSelectStarElement(@NotNull MySqlParser.SelectStarElementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#xuidStringId}.
	 * @param ctx the parse tree
	 */
	void enterXuidStringId(@NotNull MySqlParser.XuidStringIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#xuidStringId}.
	 * @param ctx the parse tree
	 */
	void exitXuidStringId(@NotNull MySqlParser.XuidStringIdContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#ownerStatement}.
	 * @param ctx the parse tree
	 */
	void enterOwnerStatement(@NotNull MySqlParser.OwnerStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#ownerStatement}.
	 * @param ctx the parse tree
	 */
	void exitOwnerStatement(@NotNull MySqlParser.OwnerStatementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code alterByDisableKeys}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDisableKeys(@NotNull MySqlParser.AlterByDisableKeysContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDisableKeys}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDisableKeys(@NotNull MySqlParser.AlterByDisableKeysContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(@NotNull MySqlParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(@NotNull MySqlParser.ConstantContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#changeReplicationFilter}.
	 * @param ctx the parse tree
	 */
	void enterChangeReplicationFilter(@NotNull MySqlParser.ChangeReplicationFilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#changeReplicationFilter}.
	 * @param ctx the parse tree
	 */
	void exitChangeReplicationFilter(@NotNull MySqlParser.ChangeReplicationFilterContext ctx);

	/**
	 * Enter a parse tree produced by the {@code mysqlVariableExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterMysqlVariableExpressionAtom(@NotNull MySqlParser.MysqlVariableExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mysqlVariableExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitMysqlVariableExpressionAtom(@NotNull MySqlParser.MysqlVariableExpressionAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#prepareStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrepareStatement(@NotNull MySqlParser.PrepareStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#prepareStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrepareStatement(@NotNull MySqlParser.PrepareStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#dropTrigger}.
	 * @param ctx the parse tree
	 */
	void enterDropTrigger(@NotNull MySqlParser.DropTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#dropTrigger}.
	 * @param ctx the parse tree
	 */
	void exitDropTrigger(@NotNull MySqlParser.DropTriggerContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#handlerCloseStatement}.
	 * @param ctx the parse tree
	 */
	void enterHandlerCloseStatement(@NotNull MySqlParser.HandlerCloseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#handlerCloseStatement}.
	 * @param ctx the parse tree
	 */
	void exitHandlerCloseStatement(@NotNull MySqlParser.HandlerCloseStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#simpleStrings}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStrings(@NotNull MySqlParser.SimpleStringsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#simpleStrings}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStrings(@NotNull MySqlParser.SimpleStringsContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#setTransactionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetTransactionStatement(@NotNull MySqlParser.SetTransactionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#setTransactionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetTransactionStatement(@NotNull MySqlParser.SetTransactionStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#stopGroupReplication}.
	 * @param ctx the parse tree
	 */
	void enterStopGroupReplication(@NotNull MySqlParser.StopGroupReplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#stopGroupReplication}.
	 * @param ctx the parse tree
	 */
	void exitStopGroupReplication(@NotNull MySqlParser.StopGroupReplicationContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#sqlStatements}.
	 * @param ctx the parse tree
	 */
	void enterSqlStatements(@NotNull MySqlParser.SqlStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#sqlStatements}.
	 * @param ctx the parse tree
	 */
	void exitSqlStatements(@NotNull MySqlParser.SqlStatementsContext ctx);

	/**
	 * Enter a parse tree produced by the {@code alterByDropForeignKey}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDropForeignKey(@NotNull MySqlParser.AlterByDropForeignKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDropForeignKey}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDropForeignKey(@NotNull MySqlParser.AlterByDropForeignKeyContext ctx);

	/**
	 * Enter a parse tree produced by the {@code tableOptionRecalculation}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionRecalculation(@NotNull MySqlParser.TableOptionRecalculationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionRecalculation}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionRecalculation(@NotNull MySqlParser.TableOptionRecalculationContext ctx);

	/**
	 * Enter a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowColumns(@NotNull MySqlParser.ShowColumnsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowColumns(@NotNull MySqlParser.ShowColumnsContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#collationName}.
	 * @param ctx the parse tree
	 */
	void enterCollationName(@NotNull MySqlParser.CollationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#collationName}.
	 * @param ctx the parse tree
	 */
	void exitCollationName(@NotNull MySqlParser.CollationNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#indexHint}.
	 * @param ctx the parse tree
	 */
	void enterIndexHint(@NotNull MySqlParser.IndexHintContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#indexHint}.
	 * @param ctx the parse tree
	 */
	void exitIndexHint(@NotNull MySqlParser.IndexHintContext ctx);

	/**
	 * Enter a parse tree produced by the {@code collectionDataType}
	 * labeled alternative in {@link MySqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterCollectionDataType(@NotNull MySqlParser.CollectionDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code collectionDataType}
	 * labeled alternative in {@link MySqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitCollectionDataType(@NotNull MySqlParser.CollectionDataTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(@NotNull MySqlParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(@NotNull MySqlParser.ComparisonOperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#revokeProxy}.
	 * @param ctx the parse tree
	 */
	void enterRevokeProxy(@NotNull MySqlParser.RevokeProxyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#revokeProxy}.
	 * @param ctx the parse tree
	 */
	void exitRevokeProxy(@NotNull MySqlParser.RevokeProxyContext ctx);

	/**
	 * Enter a parse tree produced by the {@code alterByDiscardTablespace}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDiscardTablespace(@NotNull MySqlParser.AlterByDiscardTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDiscardTablespace}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDiscardTablespace(@NotNull MySqlParser.AlterByDiscardTablespaceContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#handlerStatement}.
	 * @param ctx the parse tree
	 */
	void enterHandlerStatement(@NotNull MySqlParser.HandlerStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#handlerStatement}.
	 * @param ctx the parse tree
	 */
	void exitHandlerStatement(@NotNull MySqlParser.HandlerStatementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code unionSelect}
	 * labeled alternative in {@link MySqlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterUnionSelect(@NotNull MySqlParser.UnionSelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unionSelect}
	 * labeled alternative in {@link MySqlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitUnionSelect(@NotNull MySqlParser.UnionSelectContext ctx);

	/**
	 * Enter a parse tree produced by the {@code alterBySetAlgorithm}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterBySetAlgorithm(@NotNull MySqlParser.AlterBySetAlgorithmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterBySetAlgorithm}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterBySetAlgorithm(@NotNull MySqlParser.AlterBySetAlgorithmContext ctx);

	/**
	 * Enter a parse tree produced by the {@code showIndexes}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowIndexes(@NotNull MySqlParser.ShowIndexesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showIndexes}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowIndexes(@NotNull MySqlParser.ShowIndexesContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#createFunction}.
	 * @param ctx the parse tree
	 */
	void enterCreateFunction(@NotNull MySqlParser.CreateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#createFunction}.
	 * @param ctx the parse tree
	 */
	void exitCreateFunction(@NotNull MySqlParser.CreateFunctionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code primaryKeyTableConstraint}
	 * labeled alternative in {@link MySqlParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKeyTableConstraint(@NotNull MySqlParser.PrimaryKeyTableConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryKeyTableConstraint}
	 * labeled alternative in {@link MySqlParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKeyTableConstraint(@NotNull MySqlParser.PrimaryKeyTableConstraintContext ctx);

	/**
	 * Enter a parse tree produced by the {@code masterBoolOption}
	 * labeled alternative in {@link MySqlParser#masterOption}.
	 * @param ctx the parse tree
	 */
	void enterMasterBoolOption(@NotNull MySqlParser.MasterBoolOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code masterBoolOption}
	 * labeled alternative in {@link MySqlParser#masterOption}.
	 * @param ctx the parse tree
	 */
	void exitMasterBoolOption(@NotNull MySqlParser.MasterBoolOptionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code describeConnection}
	 * labeled alternative in {@link MySqlParser#describeObjectClause}.
	 * @param ctx the parse tree
	 */
	void enterDescribeConnection(@NotNull MySqlParser.DescribeConnectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeConnection}
	 * labeled alternative in {@link MySqlParser#describeObjectClause}.
	 * @param ctx the parse tree
	 */
	void exitDescribeConnection(@NotNull MySqlParser.DescribeConnectionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code tableOptionMinRows}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionMinRows(@NotNull MySqlParser.TableOptionMinRowsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionMinRows}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionMinRows(@NotNull MySqlParser.TableOptionMinRowsContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void enterAlterTable(@NotNull MySqlParser.AlterTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void exitAlterTable(@NotNull MySqlParser.AlterTableContext ctx);

	/**
	 * Enter a parse tree produced by the {@code storageColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterStorageColumnConstraint(@NotNull MySqlParser.StorageColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code storageColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitStorageColumnConstraint(@NotNull MySqlParser.StorageColumnConstraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#channelOption}.
	 * @param ctx the parse tree
	 */
	void enterChannelOption(@NotNull MySqlParser.ChannelOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#channelOption}.
	 * @param ctx the parse tree
	 */
	void exitChannelOption(@NotNull MySqlParser.ChannelOptionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#xaCommitWork}.
	 * @param ctx the parse tree
	 */
	void enterXaCommitWork(@NotNull MySqlParser.XaCommitWorkContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#xaCommitWork}.
	 * @param ctx the parse tree
	 */
	void exitXaCommitWork(@NotNull MySqlParser.XaCommitWorkContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatement(@NotNull MySqlParser.CaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatement(@NotNull MySqlParser.CaseStatementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code alterByConvertCharset}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByConvertCharset(@NotNull MySqlParser.AlterByConvertCharsetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByConvertCharset}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByConvertCharset(@NotNull MySqlParser.AlterByConvertCharsetContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#userVariables}.
	 * @param ctx the parse tree
	 */
	void enterUserVariables(@NotNull MySqlParser.UserVariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#userVariables}.
	 * @param ctx the parse tree
	 */
	void exitUserVariables(@NotNull MySqlParser.UserVariablesContext ctx);

	/**
	 * Enter a parse tree produced by the {@code hashAuthOption}
	 * labeled alternative in {@link MySqlParser#userAuthOption}.
	 * @param ctx the parse tree
	 */
	void enterHashAuthOption(@NotNull MySqlParser.HashAuthOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hashAuthOption}
	 * labeled alternative in {@link MySqlParser#userAuthOption}.
	 * @param ctx the parse tree
	 */
	void exitHashAuthOption(@NotNull MySqlParser.HashAuthOptionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code alterByAnalyzePartitiion}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAnalyzePartitiion(@NotNull MySqlParser.AlterByAnalyzePartitiionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAnalyzePartitiion}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAnalyzePartitiion(@NotNull MySqlParser.AlterByAnalyzePartitiionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code dataTypeFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeFunctionCall(@NotNull MySqlParser.DataTypeFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dataTypeFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeFunctionCall(@NotNull MySqlParser.DataTypeFunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by the {@code tableOptionPackKeys}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionPackKeys(@NotNull MySqlParser.TableOptionPackKeysContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionPackKeys}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionPackKeys(@NotNull MySqlParser.TableOptionPackKeysContext ctx);

	/**
	 * Enter a parse tree produced by the {@code intervalExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterIntervalExpressionAtom(@NotNull MySqlParser.IntervalExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intervalExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitIntervalExpressionAtom(@NotNull MySqlParser.IntervalExpressionAtomContext ctx);

	/**
	 * Enter a parse tree produced by the {@code copyCreateTable}
	 * labeled alternative in {@link MySqlParser#createTable}.
	 * @param ctx the parse tree
	 */
	void enterCopyCreateTable(@NotNull MySqlParser.CopyCreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code copyCreateTable}
	 * labeled alternative in {@link MySqlParser#createTable}.
	 * @param ctx the parse tree
	 */
	void exitCopyCreateTable(@NotNull MySqlParser.CopyCreateTableContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#updatedElement}.
	 * @param ctx the parse tree
	 */
	void enterUpdatedElement(@NotNull MySqlParser.UpdatedElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#updatedElement}.
	 * @param ctx the parse tree
	 */
	void exitUpdatedElement(@NotNull MySqlParser.UpdatedElementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code naturalJoin}
	 * labeled alternative in {@link MySqlParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void enterNaturalJoin(@NotNull MySqlParser.NaturalJoinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code naturalJoin}
	 * labeled alternative in {@link MySqlParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void exitNaturalJoin(@NotNull MySqlParser.NaturalJoinContext ctx);

	/**
	 * Enter a parse tree produced by the {@code charFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterCharFunctionCall(@NotNull MySqlParser.CharFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitCharFunctionCall(@NotNull MySqlParser.CharFunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by the {@code defaultColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterDefaultColumnConstraint(@NotNull MySqlParser.DefaultColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defaultColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitDefaultColumnConstraint(@NotNull MySqlParser.DefaultColumnConstraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#alterFunction}.
	 * @param ctx the parse tree
	 */
	void enterAlterFunction(@NotNull MySqlParser.AlterFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#alterFunction}.
	 * @param ctx the parse tree
	 */
	void exitAlterFunction(@NotNull MySqlParser.AlterFunctionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code definiteTablePrivLevel}
	 * labeled alternative in {@link MySqlParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void enterDefiniteTablePrivLevel(@NotNull MySqlParser.DefiniteTablePrivLevelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code definiteTablePrivLevel}
	 * labeled alternative in {@link MySqlParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void exitDefiniteTablePrivLevel(@NotNull MySqlParser.DefiniteTablePrivLevelContext ctx);

	/**
	 * Enter a parse tree produced by the {@code relayLogUntilOption}
	 * labeled alternative in {@link MySqlParser#untilOption}.
	 * @param ctx the parse tree
	 */
	void enterRelayLogUntilOption(@NotNull MySqlParser.RelayLogUntilOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relayLogUntilOption}
	 * labeled alternative in {@link MySqlParser#untilOption}.
	 * @param ctx the parse tree
	 */
	void exitRelayLogUntilOption(@NotNull MySqlParser.RelayLogUntilOptionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#transactionOption}.
	 * @param ctx the parse tree
	 */
	void enterTransactionOption(@NotNull MySqlParser.TransactionOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#transactionOption}.
	 * @param ctx the parse tree
	 */
	void exitTransactionOption(@NotNull MySqlParser.TransactionOptionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(@NotNull MySqlParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(@NotNull MySqlParser.BlockStatementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code handlerConditionCode}
	 * labeled alternative in {@link MySqlParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void enterHandlerConditionCode(@NotNull MySqlParser.HandlerConditionCodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code handlerConditionCode}
	 * labeled alternative in {@link MySqlParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void exitHandlerConditionCode(@NotNull MySqlParser.HandlerConditionCodeContext ctx);

	/**
	 * Enter a parse tree produced by the {@code partitionListVector}
	 * labeled alternative in {@link MySqlParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartitionListVector(@NotNull MySqlParser.PartitionListVectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionListVector}
	 * labeled alternative in {@link MySqlParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartitionListVector(@NotNull MySqlParser.PartitionListVectorContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#purgeBinaryLogs}.
	 * @param ctx the parse tree
	 */
	void enterPurgeBinaryLogs(@NotNull MySqlParser.PurgeBinaryLogsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#purgeBinaryLogs}.
	 * @param ctx the parse tree
	 */
	void exitPurgeBinaryLogs(@NotNull MySqlParser.PurgeBinaryLogsContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#createServer}.
	 * @param ctx the parse tree
	 */
	void enterCreateServer(@NotNull MySqlParser.CreateServerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#createServer}.
	 * @param ctx the parse tree
	 */
	void exitCreateServer(@NotNull MySqlParser.CreateServerContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#caseFuncAlternative}.
	 * @param ctx the parse tree
	 */
	void enterCaseFuncAlternative(@NotNull MySqlParser.CaseFuncAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#caseFuncAlternative}.
	 * @param ctx the parse tree
	 */
	void exitCaseFuncAlternative(@NotNull MySqlParser.CaseFuncAlternativeContext ctx);

	/**
	 * Enter a parse tree produced by the {@code showEngine}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowEngine(@NotNull MySqlParser.ShowEngineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showEngine}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowEngine(@NotNull MySqlParser.ShowEngineContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#selectLinesInto}.
	 * @param ctx the parse tree
	 */
	void enterSelectLinesInto(@NotNull MySqlParser.SelectLinesIntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#selectLinesInto}.
	 * @param ctx the parse tree
	 */
	void exitSelectLinesInto(@NotNull MySqlParser.SelectLinesIntoContext ctx);

	/**
	 * Enter a parse tree produced by the {@code tableSourceNested}
	 * labeled alternative in {@link MySqlParser#tableSource}.
	 * @param ctx the parse tree
	 */
	void enterTableSourceNested(@NotNull MySqlParser.TableSourceNestedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableSourceNested}
	 * labeled alternative in {@link MySqlParser#tableSource}.
	 * @param ctx the parse tree
	 */
	void exitTableSourceNested(@NotNull MySqlParser.TableSourceNestedContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#loadDataStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoadDataStatement(@NotNull MySqlParser.LoadDataStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#loadDataStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoadDataStatement(@NotNull MySqlParser.LoadDataStatementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code checkTableConstraint}
	 * labeled alternative in {@link MySqlParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void enterCheckTableConstraint(@NotNull MySqlParser.CheckTableConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code checkTableConstraint}
	 * labeled alternative in {@link MySqlParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void exitCheckTableConstraint(@NotNull MySqlParser.CheckTableConstraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#procedureSqlStatement}.
	 * @param ctx the parse tree
	 */
	void enterProcedureSqlStatement(@NotNull MySqlParser.ProcedureSqlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#procedureSqlStatement}.
	 * @param ctx the parse tree
	 */
	void exitProcedureSqlStatement(@NotNull MySqlParser.ProcedureSqlStatementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code setPassword}
	 * labeled alternative in {@link MySqlParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetPassword(@NotNull MySqlParser.SetPasswordContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setPassword}
	 * labeled alternative in {@link MySqlParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetPassword(@NotNull MySqlParser.SetPasswordContext ctx);

	/**
	 * Enter a parse tree produced by the {@code showGlobalInfo}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowGlobalInfo(@NotNull MySqlParser.ShowGlobalInfoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showGlobalInfo}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowGlobalInfo(@NotNull MySqlParser.ShowGlobalInfoContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(@NotNull MySqlParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(@NotNull MySqlParser.DecimalLiteralContext ctx);

	/**
	 * Enter a parse tree produced by the {@code partitionListAtom}
	 * labeled alternative in {@link MySqlParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartitionListAtom(@NotNull MySqlParser.PartitionListAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionListAtom}
	 * labeled alternative in {@link MySqlParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartitionListAtom(@NotNull MySqlParser.PartitionListAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#dropDatabase}.
	 * @param ctx the parse tree
	 */
	void enterDropDatabase(@NotNull MySqlParser.DropDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#dropDatabase}.
	 * @param ctx the parse tree
	 */
	void exitDropDatabase(@NotNull MySqlParser.DropDatabaseContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#transactionLevel}.
	 * @param ctx the parse tree
	 */
	void enterTransactionLevel(@NotNull MySqlParser.TransactionLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#transactionLevel}.
	 * @param ctx the parse tree
	 */
	void exitTransactionLevel(@NotNull MySqlParser.TransactionLevelContext ctx);

	/**
	 * Enter a parse tree produced by the {@code partitionFunctionList}
	 * labeled alternative in {@link MySqlParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartitionFunctionList(@NotNull MySqlParser.PartitionFunctionListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionFunctionList}
	 * labeled alternative in {@link MySqlParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartitionFunctionList(@NotNull MySqlParser.PartitionFunctionListContext ctx);

	/**
	 * Enter a parse tree produced by the {@code channelFlushOption}
	 * labeled alternative in {@link MySqlParser#flushOption}.
	 * @param ctx the parse tree
	 */
	void enterChannelFlushOption(@NotNull MySqlParser.ChannelFlushOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code channelFlushOption}
	 * labeled alternative in {@link MySqlParser#flushOption}.
	 * @param ctx the parse tree
	 */
	void exitChannelFlushOption(@NotNull MySqlParser.ChannelFlushOptionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code selectFunctionElement}
	 * labeled alternative in {@link MySqlParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void enterSelectFunctionElement(@NotNull MySqlParser.SelectFunctionElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectFunctionElement}
	 * labeled alternative in {@link MySqlParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void exitSelectFunctionElement(@NotNull MySqlParser.SelectFunctionElementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code uniqueKeyColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterUniqueKeyColumnConstraint(@NotNull MySqlParser.UniqueKeyColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code uniqueKeyColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitUniqueKeyColumnConstraint(@NotNull MySqlParser.UniqueKeyColumnConstraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#fullColumnName}.
	 * @param ctx the parse tree
	 */
	void enterFullColumnName(@NotNull MySqlParser.FullColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#fullColumnName}.
	 * @param ctx the parse tree
	 */
	void exitFullColumnName(@NotNull MySqlParser.FullColumnNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(@NotNull MySqlParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(@NotNull MySqlParser.TableNameContext ctx);

	/**
	 * Enter a parse tree produced by the {@code preciseSchedule}
	 * labeled alternative in {@link MySqlParser#scheduleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreciseSchedule(@NotNull MySqlParser.PreciseScheduleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code preciseSchedule}
	 * labeled alternative in {@link MySqlParser#scheduleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreciseSchedule(@NotNull MySqlParser.PreciseScheduleContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#procedureParameter}.
	 * @param ctx the parse tree
	 */
	void enterProcedureParameter(@NotNull MySqlParser.ProcedureParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#procedureParameter}.
	 * @param ctx the parse tree
	 */
	void exitProcedureParameter(@NotNull MySqlParser.ProcedureParameterContext ctx);

	/**
	 * Enter a parse tree produced by the {@code alterByDiscardPartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDiscardPartition(@NotNull MySqlParser.AlterByDiscardPartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDiscardPartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDiscardPartition(@NotNull MySqlParser.AlterByDiscardPartitionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code masterDecimalOption}
	 * labeled alternative in {@link MySqlParser#masterOption}.
	 * @param ctx the parse tree
	 */
	void enterMasterDecimalOption(@NotNull MySqlParser.MasterDecimalOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code masterDecimalOption}
	 * labeled alternative in {@link MySqlParser#masterOption}.
	 * @param ctx the parse tree
	 */
	void exitMasterDecimalOption(@NotNull MySqlParser.MasterDecimalOptionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code routineSecurity}
	 * labeled alternative in {@link MySqlParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void enterRoutineSecurity(@NotNull MySqlParser.RoutineSecurityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code routineSecurity}
	 * labeled alternative in {@link MySqlParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void exitRoutineSecurity(@NotNull MySqlParser.RoutineSecurityContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#indexColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterIndexColumnDefinition(@NotNull MySqlParser.IndexColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#indexColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitIndexColumnDefinition(@NotNull MySqlParser.IndexColumnDefinitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#insertStatement}.
	 * @param ctx the parse tree
	 */
	void enterInsertStatement(@NotNull MySqlParser.InsertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#insertStatement}.
	 * @param ctx the parse tree
	 */
	void exitInsertStatement(@NotNull MySqlParser.InsertStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#transactionStatement}.
	 * @param ctx the parse tree
	 */
	void enterTransactionStatement(@NotNull MySqlParser.TransactionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#transactionStatement}.
	 * @param ctx the parse tree
	 */
	void exitTransactionStatement(@NotNull MySqlParser.TransactionStatementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code alterByAddUniqueKey}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAddUniqueKey(@NotNull MySqlParser.AlterByAddUniqueKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAddUniqueKey}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAddUniqueKey(@NotNull MySqlParser.AlterByAddUniqueKeyContext ctx);

	/**
	 * Enter a parse tree produced by the {@code OpenCursor}
	 * labeled alternative in {@link MySqlParser#cursorStatement}.
	 * @param ctx the parse tree
	 */
	void enterOpenCursor(@NotNull MySqlParser.OpenCursorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpenCursor}
	 * labeled alternative in {@link MySqlParser#cursorStatement}.
	 * @param ctx the parse tree
	 */
	void exitOpenCursor(@NotNull MySqlParser.OpenCursorContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#resetMaster}.
	 * @param ctx the parse tree
	 */
	void enterResetMaster(@NotNull MySqlParser.ResetMasterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#resetMaster}.
	 * @param ctx the parse tree
	 */
	void exitResetMaster(@NotNull MySqlParser.ResetMasterContext ctx);

	/**
	 * Enter a parse tree produced by the {@code showGrants}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowGrants(@NotNull MySqlParser.ShowGrantsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showGrants}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowGrants(@NotNull MySqlParser.ShowGrantsContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#ddlStatement}.
	 * @param ctx the parse tree
	 */
	void enterDdlStatement(@NotNull MySqlParser.DdlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#ddlStatement}.
	 * @param ctx the parse tree
	 */
	void exitDdlStatement(@NotNull MySqlParser.DdlStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#engineName}.
	 * @param ctx the parse tree
	 */
	void enterEngineName(@NotNull MySqlParser.EngineNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#engineName}.
	 * @param ctx the parse tree
	 */
	void exitEngineName(@NotNull MySqlParser.EngineNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#intervalExpr}.
	 * @param ctx the parse tree
	 */
	void enterIntervalExpr(@NotNull MySqlParser.IntervalExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#intervalExpr}.
	 * @param ctx the parse tree
	 */
	void exitIntervalExpr(@NotNull MySqlParser.IntervalExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#lengthTwoOptionalDimension}.
	 * @param ctx the parse tree
	 */
	void enterLengthTwoOptionalDimension(@NotNull MySqlParser.LengthTwoOptionalDimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#lengthTwoOptionalDimension}.
	 * @param ctx the parse tree
	 */
	void exitLengthTwoOptionalDimension(@NotNull MySqlParser.LengthTwoOptionalDimensionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(@NotNull MySqlParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(@NotNull MySqlParser.ReturnStatementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code showCountErrors}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowCountErrors(@NotNull MySqlParser.ShowCountErrorsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCountErrors}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowCountErrors(@NotNull MySqlParser.ShowCountErrorsContext ctx);

	/**
	 * Enter a parse tree produced by the {@code wildDoTableReplication}
	 * labeled alternative in {@link MySqlParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void enterWildDoTableReplication(@NotNull MySqlParser.WildDoTableReplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wildDoTableReplication}
	 * labeled alternative in {@link MySqlParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void exitWildDoTableReplication(@NotNull MySqlParser.WildDoTableReplicationContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void enterSelectElements(@NotNull MySqlParser.SelectElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void exitSelectElements(@NotNull MySqlParser.SelectElementsContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#deleteStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeleteStatement(@NotNull MySqlParser.DeleteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#deleteStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeleteStatement(@NotNull MySqlParser.DeleteStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#createProcedure}.
	 * @param ctx the parse tree
	 */
	void enterCreateProcedure(@NotNull MySqlParser.CreateProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#createProcedure}.
	 * @param ctx the parse tree
	 */
	void exitCreateProcedure(@NotNull MySqlParser.CreateProcedureContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#tableIndexes}.
	 * @param ctx the parse tree
	 */
	void enterTableIndexes(@NotNull MySqlParser.TableIndexesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#tableIndexes}.
	 * @param ctx the parse tree
	 */
	void exitTableIndexes(@NotNull MySqlParser.TableIndexesContext ctx);

	/**
	 * Enter a parse tree produced by the {@code existsExpessionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterExistsExpessionAtom(@NotNull MySqlParser.ExistsExpessionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code existsExpessionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitExistsExpessionAtom(@NotNull MySqlParser.ExistsExpessionAtomContext ctx);

	/**
	 * Enter a parse tree produced by the {@code ignoreDbReplication}
	 * labeled alternative in {@link MySqlParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void enterIgnoreDbReplication(@NotNull MySqlParser.IgnoreDbReplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ignoreDbReplication}
	 * labeled alternative in {@link MySqlParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void exitIgnoreDbReplication(@NotNull MySqlParser.IgnoreDbReplicationContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#routineBody}.
	 * @param ctx the parse tree
	 */
	void enterRoutineBody(@NotNull MySqlParser.RoutineBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#routineBody}.
	 * @param ctx the parse tree
	 */
	void exitRoutineBody(@NotNull MySqlParser.RoutineBodyContext ctx);

	/**
	 * Enter a parse tree produced by the {@code stringAuthOption}
	 * labeled alternative in {@link MySqlParser#userAuthOption}.
	 * @param ctx the parse tree
	 */
	void enterStringAuthOption(@NotNull MySqlParser.StringAuthOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAuthOption}
	 * labeled alternative in {@link MySqlParser#userAuthOption}.
	 * @param ctx the parse tree
	 */
	void exitStringAuthOption(@NotNull MySqlParser.StringAuthOptionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code routineComment}
	 * labeled alternative in {@link MySqlParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void enterRoutineComment(@NotNull MySqlParser.RoutineCommentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code routineComment}
	 * labeled alternative in {@link MySqlParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void exitRoutineComment(@NotNull MySqlParser.RoutineCommentContext ctx);

	/**
	 * Enter a parse tree produced by the {@code referenceColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterReferenceColumnConstraint(@NotNull MySqlParser.ReferenceColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code referenceColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitReferenceColumnConstraint(@NotNull MySqlParser.ReferenceColumnConstraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#lengthTwoDimension}.
	 * @param ctx the parse tree
	 */
	void enterLengthTwoDimension(@NotNull MySqlParser.LengthTwoDimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#lengthTwoDimension}.
	 * @param ctx the parse tree
	 */
	void exitLengthTwoDimension(@NotNull MySqlParser.LengthTwoDimensionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code tableOptionAutoIncrement}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionAutoIncrement(@NotNull MySqlParser.TableOptionAutoIncrementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionAutoIncrement}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionAutoIncrement(@NotNull MySqlParser.TableOptionAutoIncrementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code partitionOptionComment}
	 * labeled alternative in {@link MySqlParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void enterPartitionOptionComment(@NotNull MySqlParser.PartitionOptionCommentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionOptionComment}
	 * labeled alternative in {@link MySqlParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void exitPartitionOptionComment(@NotNull MySqlParser.PartitionOptionCommentContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#bitOperator}.
	 * @param ctx the parse tree
	 */
	void enterBitOperator(@NotNull MySqlParser.BitOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#bitOperator}.
	 * @param ctx the parse tree
	 */
	void exitBitOperator(@NotNull MySqlParser.BitOperatorContext ctx);

	/**
	 * Enter a parse tree produced by the {@code showErrors}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowErrors(@NotNull MySqlParser.ShowErrorsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showErrors}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowErrors(@NotNull MySqlParser.ShowErrorsContext ctx);

	/**
	 * Enter a parse tree produced by the {@code inPredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterInPredicate(@NotNull MySqlParser.InPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inPredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitInPredicate(@NotNull MySqlParser.InPredicateContext ctx);

	/**
	 * Enter a parse tree produced by the {@code binaryComparasionPredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterBinaryComparasionPredicate(@NotNull MySqlParser.BinaryComparasionPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryComparasionPredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitBinaryComparasionPredicate(@NotNull MySqlParser.BinaryComparasionPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#xaRollbackWork}.
	 * @param ctx the parse tree
	 */
	void enterXaRollbackWork(@NotNull MySqlParser.XaRollbackWorkContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#xaRollbackWork}.
	 * @param ctx the parse tree
	 */
	void exitXaRollbackWork(@NotNull MySqlParser.XaRollbackWorkContext ctx);

	/**
	 * Enter a parse tree produced by the {@code mathExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterMathExpressionAtom(@NotNull MySqlParser.MathExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mathExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitMathExpressionAtom(@NotNull MySqlParser.MathExpressionAtomContext ctx);

	/**
	 * Enter a parse tree produced by the {@code primaryKeyColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKeyColumnConstraint(@NotNull MySqlParser.PrimaryKeyColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryKeyColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKeyColumnConstraint(@NotNull MySqlParser.PrimaryKeyColumnConstraintContext ctx);

	/**
	 * Enter a parse tree produced by the {@code indexDeclaration}
	 * labeled alternative in {@link MySqlParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void enterIndexDeclaration(@NotNull MySqlParser.IndexDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code indexDeclaration}
	 * labeled alternative in {@link MySqlParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void exitIndexDeclaration(@NotNull MySqlParser.IndexDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#installPlugin}.
	 * @param ctx the parse tree
	 */
	void enterInstallPlugin(@NotNull MySqlParser.InstallPluginContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#installPlugin}.
	 * @param ctx the parse tree
	 */
	void exitInstallPlugin(@NotNull MySqlParser.InstallPluginContext ctx);

	/**
	 * Enter a parse tree produced by the {@code substrFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterSubstrFunctionCall(@NotNull MySqlParser.SubstrFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code substrFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitSubstrFunctionCall(@NotNull MySqlParser.SubstrFunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by the {@code uniqueKeyTableConstraint}
	 * labeled alternative in {@link MySqlParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void enterUniqueKeyTableConstraint(@NotNull MySqlParser.UniqueKeyTableConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code uniqueKeyTableConstraint}
	 * labeled alternative in {@link MySqlParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void exitUniqueKeyTableConstraint(@NotNull MySqlParser.UniqueKeyTableConstraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#unlockTables}.
	 * @param ctx the parse tree
	 */
	void enterUnlockTables(@NotNull MySqlParser.UnlockTablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#unlockTables}.
	 * @param ctx the parse tree
	 */
	void exitUnlockTables(@NotNull MySqlParser.UnlockTablesContext ctx);

	/**
	 * Enter a parse tree produced by the {@code positionFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterPositionFunctionCall(@NotNull MySqlParser.PositionFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code positionFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitPositionFunctionCall(@NotNull MySqlParser.PositionFunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#timestampValue}.
	 * @param ctx the parse tree
	 */
	void enterTimestampValue(@NotNull MySqlParser.TimestampValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#timestampValue}.
	 * @param ctx the parse tree
	 */
	void exitTimestampValue(@NotNull MySqlParser.TimestampValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#stopSlave}.
	 * @param ctx the parse tree
	 */
	void enterStopSlave(@NotNull MySqlParser.StopSlaveContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#stopSlave}.
	 * @param ctx the parse tree
	 */
	void exitStopSlave(@NotNull MySqlParser.StopSlaveContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#handlerReadStatement}.
	 * @param ctx the parse tree
	 */
	void enterHandlerReadStatement(@NotNull MySqlParser.HandlerReadStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#handlerReadStatement}.
	 * @param ctx the parse tree
	 */
	void exitHandlerReadStatement(@NotNull MySqlParser.HandlerReadStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#nullNotnull}.
	 * @param ctx the parse tree
	 */
	void enterNullNotnull(@NotNull MySqlParser.NullNotnullContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#nullNotnull}.
	 * @param ctx the parse tree
	 */
	void exitNullNotnull(@NotNull MySqlParser.NullNotnullContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#referenceDefinition}.
	 * @param ctx the parse tree
	 */
	void enterReferenceDefinition(@NotNull MySqlParser.ReferenceDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#referenceDefinition}.
	 * @param ctx the parse tree
	 */
	void exitReferenceDefinition(@NotNull MySqlParser.ReferenceDefinitionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code parenthesisSelect}
	 * labeled alternative in {@link MySqlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisSelect(@NotNull MySqlParser.ParenthesisSelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesisSelect}
	 * labeled alternative in {@link MySqlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisSelect(@NotNull MySqlParser.ParenthesisSelectContext ctx);

	/**
	 * Enter a parse tree produced by the {@code passwordConnectionOption}
	 * labeled alternative in {@link MySqlParser#connectionOption}.
	 * @param ctx the parse tree
	 */
	void enterPasswordConnectionOption(@NotNull MySqlParser.PasswordConnectionOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code passwordConnectionOption}
	 * labeled alternative in {@link MySqlParser#connectionOption}.
	 * @param ctx the parse tree
	 */
	void exitPasswordConnectionOption(@NotNull MySqlParser.PasswordConnectionOptionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#repairTable}.
	 * @param ctx the parse tree
	 */
	void enterRepairTable(@NotNull MySqlParser.RepairTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#repairTable}.
	 * @param ctx the parse tree
	 */
	void exitRepairTable(@NotNull MySqlParser.RepairTableContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#rollbackWork}.
	 * @param ctx the parse tree
	 */
	void enterRollbackWork(@NotNull MySqlParser.RollbackWorkContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#rollbackWork}.
	 * @param ctx the parse tree
	 */
	void exitRollbackWork(@NotNull MySqlParser.RollbackWorkContext ctx);

	/**
	 * Enter a parse tree produced by the {@code alterByAddIndex}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAddIndex(@NotNull MySqlParser.AlterByAddIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAddIndex}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAddIndex(@NotNull MySqlParser.AlterByAddIndexContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#simpleId}.
	 * @param ctx the parse tree
	 */
	void enterSimpleId(@NotNull MySqlParser.SimpleIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#simpleId}.
	 * @param ctx the parse tree
	 */
	void exitSimpleId(@NotNull MySqlParser.SimpleIdContext ctx);

	/**
	 * Enter a parse tree produced by the {@code subPartitionFunctionHash}
	 * labeled alternative in {@link MySqlParser#subpartitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSubPartitionFunctionHash(@NotNull MySqlParser.SubPartitionFunctionHashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subPartitionFunctionHash}
	 * labeled alternative in {@link MySqlParser#subpartitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSubPartitionFunctionHash(@NotNull MySqlParser.SubPartitionFunctionHashContext ctx);

	/**
	 * Enter a parse tree produced by the {@code alterByDropPartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDropPartition(@NotNull MySqlParser.AlterByDropPartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDropPartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDropPartition(@NotNull MySqlParser.AlterByDropPartitionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code pluginDirConnectionOption}
	 * labeled alternative in {@link MySqlParser#connectionOption}.
	 * @param ctx the parse tree
	 */
	void enterPluginDirConnectionOption(@NotNull MySqlParser.PluginDirConnectionOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pluginDirConnectionOption}
	 * labeled alternative in {@link MySqlParser#connectionOption}.
	 * @param ctx the parse tree
	 */
	void exitPluginDirConnectionOption(@NotNull MySqlParser.PluginDirConnectionOptionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#lockTables}.
	 * @param ctx the parse tree
	 */
	void enterLockTables(@NotNull MySqlParser.LockTablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#lockTables}.
	 * @param ctx the parse tree
	 */
	void exitLockTables(@NotNull MySqlParser.LockTablesContext ctx);

	/**
	 * Enter a parse tree produced by the {@code collateExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterCollateExpressionAtom(@NotNull MySqlParser.CollateExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code collateExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitCollateExpressionAtom(@NotNull MySqlParser.CollateExpressionAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#tableSources}.
	 * @param ctx the parse tree
	 */
	void enterTableSources(@NotNull MySqlParser.TableSourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#tableSources}.
	 * @param ctx the parse tree
	 */
	void exitTableSources(@NotNull MySqlParser.TableSourcesContext ctx);

	/**
	 * Enter a parse tree produced by the {@code alterByModifyColumn}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByModifyColumn(@NotNull MySqlParser.AlterByModifyColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByModifyColumn}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByModifyColumn(@NotNull MySqlParser.AlterByModifyColumnContext ctx);

	/**
	 * Enter a parse tree produced by the {@code alterByTableOption}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByTableOption(@NotNull MySqlParser.AlterByTableOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByTableOption}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByTableOption(@NotNull MySqlParser.AlterByTableOptionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code alterByDropPrimaryKey}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDropPrimaryKey(@NotNull MySqlParser.AlterByDropPrimaryKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDropPrimaryKey}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDropPrimaryKey(@NotNull MySqlParser.AlterByDropPrimaryKeyContext ctx);

	/**
	 * Enter a parse tree produced by the {@code isNullPredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterIsNullPredicate(@NotNull MySqlParser.IsNullPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isNullPredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitIsNullPredicate(@NotNull MySqlParser.IsNullPredicateContext ctx);

	/**
	 * Enter a parse tree produced by the {@code columnCreateTable}
	 * labeled alternative in {@link MySqlParser#createTable}.
	 * @param ctx the parse tree
	 */
	void enterColumnCreateTable(@NotNull MySqlParser.ColumnCreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnCreateTable}
	 * labeled alternative in {@link MySqlParser#createTable}.
	 * @param ctx the parse tree
	 */
	void exitColumnCreateTable(@NotNull MySqlParser.ColumnCreateTableContext ctx);

	/**
	 * Enter a parse tree produced by the {@code globalPrivLevel}
	 * labeled alternative in {@link MySqlParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void enterGlobalPrivLevel(@NotNull MySqlParser.GlobalPrivLevelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code globalPrivLevel}
	 * labeled alternative in {@link MySqlParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void exitGlobalPrivLevel(@NotNull MySqlParser.GlobalPrivLevelContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(@NotNull MySqlParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(@NotNull MySqlParser.ExpressionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#resetSlave}.
	 * @param ctx the parse tree
	 */
	void enterResetSlave(@NotNull MySqlParser.ResetSlaveContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#resetSlave}.
	 * @param ctx the parse tree
	 */
	void exitResetSlave(@NotNull MySqlParser.ResetSlaveContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#hexadecimalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterHexadecimalLiteral(@NotNull MySqlParser.HexadecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#hexadecimalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitHexadecimalLiteral(@NotNull MySqlParser.HexadecimalLiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#cacheIndexStatement}.
	 * @param ctx the parse tree
	 */
	void enterCacheIndexStatement(@NotNull MySqlParser.CacheIndexStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#cacheIndexStatement}.
	 * @param ctx the parse tree
	 */
	void exitCacheIndexStatement(@NotNull MySqlParser.CacheIndexStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#aggregateWindowedFunction}.
	 * @param ctx the parse tree
	 */
	void enterAggregateWindowedFunction(@NotNull MySqlParser.AggregateWindowedFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#aggregateWindowedFunction}.
	 * @param ctx the parse tree
	 */
	void exitAggregateWindowedFunction(@NotNull MySqlParser.AggregateWindowedFunctionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code alterByEnableKeys}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByEnableKeys(@NotNull MySqlParser.AlterByEnableKeysContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByEnableKeys}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByEnableKeys(@NotNull MySqlParser.AlterByEnableKeysContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#alterProcedure}.
	 * @param ctx the parse tree
	 */
	void enterAlterProcedure(@NotNull MySqlParser.AlterProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#alterProcedure}.
	 * @param ctx the parse tree
	 */
	void exitAlterProcedure(@NotNull MySqlParser.AlterProcedureContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperator(@NotNull MySqlParser.LogicalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperator(@NotNull MySqlParser.LogicalOperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#checkTableOption}.
	 * @param ctx the parse tree
	 */
	void enterCheckTableOption(@NotNull MySqlParser.CheckTableOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#checkTableOption}.
	 * @param ctx the parse tree
	 */
	void exitCheckTableOption(@NotNull MySqlParser.CheckTableOptionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code intervalSchedule}
	 * labeled alternative in {@link MySqlParser#scheduleExpression}.
	 * @param ctx the parse tree
	 */
	void enterIntervalSchedule(@NotNull MySqlParser.IntervalScheduleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intervalSchedule}
	 * labeled alternative in {@link MySqlParser#scheduleExpression}.
	 * @param ctx the parse tree
	 */
	void exitIntervalSchedule(@NotNull MySqlParser.IntervalScheduleContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void enterQuerySpecification(@NotNull MySqlParser.QuerySpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void exitQuerySpecification(@NotNull MySqlParser.QuerySpecificationContext ctx);

	/**
	 * Enter a parse tree produced by the {@code showRoutine}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowRoutine(@NotNull MySqlParser.ShowRoutineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showRoutine}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowRoutine(@NotNull MySqlParser.ShowRoutineContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#tablePair}.
	 * @param ctx the parse tree
	 */
	void enterTablePair(@NotNull MySqlParser.TablePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#tablePair}.
	 * @param ctx the parse tree
	 */
	void exitTablePair(@NotNull MySqlParser.TablePairContext ctx);

	/**
	 * Enter a parse tree produced by the {@code setTransaction}
	 * labeled alternative in {@link MySqlParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetTransaction(@NotNull MySqlParser.SetTransactionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTransaction}
	 * labeled alternative in {@link MySqlParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetTransaction(@NotNull MySqlParser.SetTransactionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#fileSizeLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFileSizeLiteral(@NotNull MySqlParser.FileSizeLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#fileSizeLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFileSizeLiteral(@NotNull MySqlParser.FileSizeLiteralContext ctx);

	/**
	 * Enter a parse tree produced by the {@code handlerConditionState}
	 * labeled alternative in {@link MySqlParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void enterHandlerConditionState(@NotNull MySqlParser.HandlerConditionStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code handlerConditionState}
	 * labeled alternative in {@link MySqlParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void exitHandlerConditionState(@NotNull MySqlParser.HandlerConditionStateContext ctx);

	/**
	 * Enter a parse tree produced by the {@code atomTableItem}
	 * labeled alternative in {@link MySqlParser#tableSourceItem}.
	 * @param ctx the parse tree
	 */
	void enterAtomTableItem(@NotNull MySqlParser.AtomTableItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomTableItem}
	 * labeled alternative in {@link MySqlParser#tableSourceItem}.
	 * @param ctx the parse tree
	 */
	void exitAtomTableItem(@NotNull MySqlParser.AtomTableItemContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#keywordsCanBeId}.
	 * @param ctx the parse tree
	 */
	void enterKeywordsCanBeId(@NotNull MySqlParser.KeywordsCanBeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#keywordsCanBeId}.
	 * @param ctx the parse tree
	 */
	void exitKeywordsCanBeId(@NotNull MySqlParser.KeywordsCanBeIdContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#lockAction}.
	 * @param ctx the parse tree
	 */
	void enterLockAction(@NotNull MySqlParser.LockActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#lockAction}.
	 * @param ctx the parse tree
	 */
	void exitLockAction(@NotNull MySqlParser.LockActionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code tableOptionPassword}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionPassword(@NotNull MySqlParser.TableOptionPasswordContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionPassword}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionPassword(@NotNull MySqlParser.TableOptionPasswordContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#utilityStatement}.
	 * @param ctx the parse tree
	 */
	void enterUtilityStatement(@NotNull MySqlParser.UtilityStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#utilityStatement}.
	 * @param ctx the parse tree
	 */
	void exitUtilityStatement(@NotNull MySqlParser.UtilityStatementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code createUserMysqlV57}
	 * labeled alternative in {@link MySqlParser#createUser}.
	 * @param ctx the parse tree
	 */
	void enterCreateUserMysqlV57(@NotNull MySqlParser.CreateUserMysqlV57Context ctx);
	/**
	 * Exit a parse tree produced by the {@code createUserMysqlV57}
	 * labeled alternative in {@link MySqlParser#createUser}.
	 * @param ctx the parse tree
	 */
	void exitCreateUserMysqlV57(@NotNull MySqlParser.CreateUserMysqlV57Context ctx);

	/**
	 * Enter a parse tree produced by the {@code createUserMysqlV56}
	 * labeled alternative in {@link MySqlParser#createUser}.
	 * @param ctx the parse tree
	 */
	void enterCreateUserMysqlV56(@NotNull MySqlParser.CreateUserMysqlV56Context ctx);
	/**
	 * Exit a parse tree produced by the {@code createUserMysqlV56}
	 * labeled alternative in {@link MySqlParser#createUser}.
	 * @param ctx the parse tree
	 */
	void exitCreateUserMysqlV56(@NotNull MySqlParser.CreateUserMysqlV56Context ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#declareCursor}.
	 * @param ctx the parse tree
	 */
	void enterDeclareCursor(@NotNull MySqlParser.DeclareCursorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#declareCursor}.
	 * @param ctx the parse tree
	 */
	void exitDeclareCursor(@NotNull MySqlParser.DeclareCursorContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#assignmentField}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentField(@NotNull MySqlParser.AssignmentFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#assignmentField}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentField(@NotNull MySqlParser.AssignmentFieldContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#truncateTable}.
	 * @param ctx the parse tree
	 */
	void enterTruncateTable(@NotNull MySqlParser.TruncateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#truncateTable}.
	 * @param ctx the parse tree
	 */
	void exitTruncateTable(@NotNull MySqlParser.TruncateTableContext ctx);

	/**
	 * Enter a parse tree produced by the {@code tableSourcesItem}
	 * labeled alternative in {@link MySqlParser#tableSourceItem}.
	 * @param ctx the parse tree
	 */
	void enterTableSourcesItem(@NotNull MySqlParser.TableSourcesItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableSourcesItem}
	 * labeled alternative in {@link MySqlParser#tableSourceItem}.
	 * @param ctx the parse tree
	 */
	void exitTableSourcesItem(@NotNull MySqlParser.TableSourcesItemContext ctx);

	/**
	 * Enter a parse tree produced by the {@code alterByExchangePartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByExchangePartition(@NotNull MySqlParser.AlterByExchangePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByExchangePartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByExchangePartition(@NotNull MySqlParser.AlterByExchangePartitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#userResourceOption}.
	 * @param ctx the parse tree
	 */
	void enterUserResourceOption(@NotNull MySqlParser.UserResourceOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#userResourceOption}.
	 * @param ctx the parse tree
	 */
	void exitUserResourceOption(@NotNull MySqlParser.UserResourceOptionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void enterDropTable(@NotNull MySqlParser.DropTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void exitDropTable(@NotNull MySqlParser.DropTableContext ctx);

	/**
	 * Enter a parse tree produced by the {@code predicateExpression}
	 * labeled alternative in {@link MySqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPredicateExpression(@NotNull MySqlParser.PredicateExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code predicateExpression}
	 * labeled alternative in {@link MySqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPredicateExpression(@NotNull MySqlParser.PredicateExpressionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code alterByImportPartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByImportPartition(@NotNull MySqlParser.AlterByImportPartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByImportPartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByImportPartition(@NotNull MySqlParser.AlterByImportPartitionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code masterRealOption}
	 * labeled alternative in {@link MySqlParser#masterOption}.
	 * @param ctx the parse tree
	 */
	void enterMasterRealOption(@NotNull MySqlParser.MasterRealOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code masterRealOption}
	 * labeled alternative in {@link MySqlParser#masterOption}.
	 * @param ctx the parse tree
	 */
	void exitMasterRealOption(@NotNull MySqlParser.MasterRealOptionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code userConnectionOption}
	 * labeled alternative in {@link MySqlParser#connectionOption}.
	 * @param ctx the parse tree
	 */
	void enterUserConnectionOption(@NotNull MySqlParser.UserConnectionOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code userConnectionOption}
	 * labeled alternative in {@link MySqlParser#connectionOption}.
	 * @param ctx the parse tree
	 */
	void exitUserConnectionOption(@NotNull MySqlParser.UserConnectionOptionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#transactionMode}.
	 * @param ctx the parse tree
	 */
	void enterTransactionMode(@NotNull MySqlParser.TransactionModeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#transactionMode}.
	 * @param ctx the parse tree
	 */
	void exitTransactionMode(@NotNull MySqlParser.TransactionModeContext ctx);

	/**
	 * Enter a parse tree produced by the {@code udfFunctionCall}
	 * labeled alternative in {@link MySqlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterUdfFunctionCall(@NotNull MySqlParser.UdfFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code udfFunctionCall}
	 * labeled alternative in {@link MySqlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitUdfFunctionCall(@NotNull MySqlParser.UdfFunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#createUdfunction}.
	 * @param ctx the parse tree
	 */
	void enterCreateUdfunction(@NotNull MySqlParser.CreateUdfunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#createUdfunction}.
	 * @param ctx the parse tree
	 */
	void exitCreateUdfunction(@NotNull MySqlParser.CreateUdfunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(@NotNull MySqlParser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(@NotNull MySqlParser.LimitClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(@NotNull MySqlParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(@NotNull MySqlParser.IfStatementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code nestedRowExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterNestedRowExpressionAtom(@NotNull MySqlParser.NestedRowExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nestedRowExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitNestedRowExpressionAtom(@NotNull MySqlParser.NestedRowExpressionAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#indexOption}.
	 * @param ctx the parse tree
	 */
	void enterIndexOption(@NotNull MySqlParser.IndexOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#indexOption}.
	 * @param ctx the parse tree
	 */
	void exitIndexOption(@NotNull MySqlParser.IndexOptionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code outerJoin}
	 * labeled alternative in {@link MySqlParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void enterOuterJoin(@NotNull MySqlParser.OuterJoinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code outerJoin}
	 * labeled alternative in {@link MySqlParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void exitOuterJoin(@NotNull MySqlParser.OuterJoinContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(@NotNull MySqlParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(@NotNull MySqlParser.WhileStatementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code partitionOptionNodeGroup}
	 * labeled alternative in {@link MySqlParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void enterPartitionOptionNodeGroup(@NotNull MySqlParser.PartitionOptionNodeGroupContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionOptionNodeGroup}
	 * labeled alternative in {@link MySqlParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void exitPartitionOptionNodeGroup(@NotNull MySqlParser.PartitionOptionNodeGroupContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#dropLogfileGroup}.
	 * @param ctx the parse tree
	 */
	void enterDropLogfileGroup(@NotNull MySqlParser.DropLogfileGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#dropLogfileGroup}.
	 * @param ctx the parse tree
	 */
	void exitDropLogfileGroup(@NotNull MySqlParser.DropLogfileGroupContext ctx);

	/**
	 * Enter a parse tree produced by the {@code tableOptionCompression}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionCompression(@NotNull MySqlParser.TableOptionCompressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionCompression}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionCompression(@NotNull MySqlParser.TableOptionCompressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#levelInWeightListElement}.
	 * @param ctx the parse tree
	 */
	void enterLevelInWeightListElement(@NotNull MySqlParser.LevelInWeightListElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#levelInWeightListElement}.
	 * @param ctx the parse tree
	 */
	void exitLevelInWeightListElement(@NotNull MySqlParser.LevelInWeightListElementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#dropServer}.
	 * @param ctx the parse tree
	 */
	void enterDropServer(@NotNull MySqlParser.DropServerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#dropServer}.
	 * @param ctx the parse tree
	 */
	void exitDropServer(@NotNull MySqlParser.DropServerContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#userSpecification}.
	 * @param ctx the parse tree
	 */
	void enterUserSpecification(@NotNull MySqlParser.UserSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#userSpecification}.
	 * @param ctx the parse tree
	 */
	void exitUserSpecification(@NotNull MySqlParser.UserSpecificationContext ctx);

	/**
	 * Enter a parse tree produced by the {@code levelWeightRange}
	 * labeled alternative in {@link MySqlParser#levelsInWeightString}.
	 * @param ctx the parse tree
	 */
	void enterLevelWeightRange(@NotNull MySqlParser.LevelWeightRangeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code levelWeightRange}
	 * labeled alternative in {@link MySqlParser#levelsInWeightString}.
	 * @param ctx the parse tree
	 */
	void exitLevelWeightRange(@NotNull MySqlParser.LevelWeightRangeContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#alterLogfileGroup}.
	 * @param ctx the parse tree
	 */
	void enterAlterLogfileGroup(@NotNull MySqlParser.AlterLogfileGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#alterLogfileGroup}.
	 * @param ctx the parse tree
	 */
	void exitAlterLogfileGroup(@NotNull MySqlParser.AlterLogfileGroupContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#declareCondition}.
	 * @param ctx the parse tree
	 */
	void enterDeclareCondition(@NotNull MySqlParser.DeclareConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#declareCondition}.
	 * @param ctx the parse tree
	 */
	void exitDeclareCondition(@NotNull MySqlParser.DeclareConditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(@NotNull MySqlParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(@NotNull MySqlParser.UnaryOperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#uidList}.
	 * @param ctx the parse tree
	 */
	void enterUidList(@NotNull MySqlParser.UidListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#uidList}.
	 * @param ctx the parse tree
	 */
	void exitUidList(@NotNull MySqlParser.UidListContext ctx);

	/**
	 * Enter a parse tree produced by the {@code subqueryExpessionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryExpessionAtom(@NotNull MySqlParser.SubqueryExpessionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subqueryExpessionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryExpessionAtom(@NotNull MySqlParser.SubqueryExpessionAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(@NotNull MySqlParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(@NotNull MySqlParser.DefaultValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#privelegeClause}.
	 * @param ctx the parse tree
	 */
	void enterPrivelegeClause(@NotNull MySqlParser.PrivelegeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#privelegeClause}.
	 * @param ctx the parse tree
	 */
	void exitPrivelegeClause(@NotNull MySqlParser.PrivelegeClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#unionStatement}.
	 * @param ctx the parse tree
	 */
	void enterUnionStatement(@NotNull MySqlParser.UnionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#unionStatement}.
	 * @param ctx the parse tree
	 */
	void exitUnionStatement(@NotNull MySqlParser.UnionStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#dropTablespace}.
	 * @param ctx the parse tree
	 */
	void enterDropTablespace(@NotNull MySqlParser.DropTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#dropTablespace}.
	 * @param ctx the parse tree
	 */
	void exitDropTablespace(@NotNull MySqlParser.DropTablespaceContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#checksumTable}.
	 * @param ctx the parse tree
	 */
	void enterChecksumTable(@NotNull MySqlParser.ChecksumTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#checksumTable}.
	 * @param ctx the parse tree
	 */
	void exitChecksumTable(@NotNull MySqlParser.ChecksumTableContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#lockTableElement}.
	 * @param ctx the parse tree
	 */
	void enterLockTableElement(@NotNull MySqlParser.LockTableElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#lockTableElement}.
	 * @param ctx the parse tree
	 */
	void exitLockTableElement(@NotNull MySqlParser.LockTableElementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#dropIndex}.
	 * @param ctx the parse tree
	 */
	void enterDropIndex(@NotNull MySqlParser.DropIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#dropIndex}.
	 * @param ctx the parse tree
	 */
	void exitDropIndex(@NotNull MySqlParser.DropIndexContext ctx);

	/**
	 * Enter a parse tree produced by the {@code partitionComparision}
	 * labeled alternative in {@link MySqlParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartitionComparision(@NotNull MySqlParser.PartitionComparisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionComparision}
	 * labeled alternative in {@link MySqlParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartitionComparision(@NotNull MySqlParser.PartitionComparisionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#partitionDefinerAtom}.
	 * @param ctx the parse tree
	 */
	void enterPartitionDefinerAtom(@NotNull MySqlParser.PartitionDefinerAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#partitionDefinerAtom}.
	 * @param ctx the parse tree
	 */
	void exitPartitionDefinerAtom(@NotNull MySqlParser.PartitionDefinerAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#lockClause}.
	 * @param ctx the parse tree
	 */
	void enterLockClause(@NotNull MySqlParser.LockClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#lockClause}.
	 * @param ctx the parse tree
	 */
	void exitLockClause(@NotNull MySqlParser.LockClauseContext ctx);

	/**
	 * Enter a parse tree produced by the {@code tableOptionCharset}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionCharset(@NotNull MySqlParser.TableOptionCharsetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionCharset}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionCharset(@NotNull MySqlParser.TableOptionCharsetContext ctx);

	/**
	 * Enter a parse tree produced by the {@code unionParenthesisSelect}
	 * labeled alternative in {@link MySqlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterUnionParenthesisSelect(@NotNull MySqlParser.UnionParenthesisSelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unionParenthesisSelect}
	 * labeled alternative in {@link MySqlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitUnionParenthesisSelect(@NotNull MySqlParser.UnionParenthesisSelectContext ctx);

	/**
	 * Enter a parse tree produced by the {@code subqueryTableItem}
	 * labeled alternative in {@link MySqlParser#tableSourceItem}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryTableItem(@NotNull MySqlParser.SubqueryTableItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subqueryTableItem}
	 * labeled alternative in {@link MySqlParser#tableSourceItem}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryTableItem(@NotNull MySqlParser.SubqueryTableItemContext ctx);

	/**
	 * Enter a parse tree produced by the {@code partitionOptionEngine}
	 * labeled alternative in {@link MySqlParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void enterPartitionOptionEngine(@NotNull MySqlParser.PartitionOptionEngineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionOptionEngine}
	 * labeled alternative in {@link MySqlParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void exitPartitionOptionEngine(@NotNull MySqlParser.PartitionOptionEngineContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#intervalTypeBase}.
	 * @param ctx the parse tree
	 */
	void enterIntervalTypeBase(@NotNull MySqlParser.IntervalTypeBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#intervalTypeBase}.
	 * @param ctx the parse tree
	 */
	void exitIntervalTypeBase(@NotNull MySqlParser.IntervalTypeBaseContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#queryExpressionNointo}.
	 * @param ctx the parse tree
	 */
	void enterQueryExpressionNointo(@NotNull MySqlParser.QueryExpressionNointoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#queryExpressionNointo}.
	 * @param ctx the parse tree
	 */
	void exitQueryExpressionNointo(@NotNull MySqlParser.QueryExpressionNointoContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#mysqlVariable}.
	 * @param ctx the parse tree
	 */
	void enterMysqlVariable(@NotNull MySqlParser.MysqlVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#mysqlVariable}.
	 * @param ctx the parse tree
	 */
	void exitMysqlVariable(@NotNull MySqlParser.MysqlVariableContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#ifNotExists}.
	 * @param ctx the parse tree
	 */
	void enterIfNotExists(@NotNull MySqlParser.IfNotExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#ifNotExists}.
	 * @param ctx the parse tree
	 */
	void exitIfNotExists(@NotNull MySqlParser.IfNotExistsContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#groupByItem}.
	 * @param ctx the parse tree
	 */
	void enterGroupByItem(@NotNull MySqlParser.GroupByItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#groupByItem}.
	 * @param ctx the parse tree
	 */
	void exitGroupByItem(@NotNull MySqlParser.GroupByItemContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#createDatabaseOption}.
	 * @param ctx the parse tree
	 */
	void enterCreateDatabaseOption(@NotNull MySqlParser.CreateDatabaseOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#createDatabaseOption}.
	 * @param ctx the parse tree
	 */
	void exitCreateDatabaseOption(@NotNull MySqlParser.CreateDatabaseOptionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#startSlave}.
	 * @param ctx the parse tree
	 */
	void enterStartSlave(@NotNull MySqlParser.StartSlaveContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#startSlave}.
	 * @param ctx the parse tree
	 */
	void exitStartSlave(@NotNull MySqlParser.StartSlaveContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#dropEvent}.
	 * @param ctx the parse tree
	 */
	void enterDropEvent(@NotNull MySqlParser.DropEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#dropEvent}.
	 * @param ctx the parse tree
	 */
	void exitDropEvent(@NotNull MySqlParser.DropEventContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(@NotNull MySqlParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(@NotNull MySqlParser.EmptyStatementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code soundsLikePredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterSoundsLikePredicate(@NotNull MySqlParser.SoundsLikePredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code soundsLikePredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitSoundsLikePredicate(@NotNull MySqlParser.SoundsLikePredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#insertStatementValue}.
	 * @param ctx the parse tree
	 */
	void enterInsertStatementValue(@NotNull MySqlParser.InsertStatementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#insertStatementValue}.
	 * @param ctx the parse tree
	 */
	void exitInsertStatementValue(@NotNull MySqlParser.InsertStatementValueContext ctx);

	/**
	 * Enter a parse tree produced by the {@code levelWeightList}
	 * labeled alternative in {@link MySqlParser#levelsInWeightString}.
	 * @param ctx the parse tree
	 */
	void enterLevelWeightList(@NotNull MySqlParser.LevelWeightListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code levelWeightList}
	 * labeled alternative in {@link MySqlParser#levelsInWeightString}.
	 * @param ctx the parse tree
	 */
	void exitLevelWeightList(@NotNull MySqlParser.LevelWeightListContext ctx);

	/**
	 * Enter a parse tree produced by the {@code trimFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterTrimFunctionCall(@NotNull MySqlParser.TrimFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trimFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitTrimFunctionCall(@NotNull MySqlParser.TrimFunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by the {@code specificFunctionCall}
	 * labeled alternative in {@link MySqlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterSpecificFunctionCall(@NotNull MySqlParser.SpecificFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code specificFunctionCall}
	 * labeled alternative in {@link MySqlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitSpecificFunctionCall(@NotNull MySqlParser.SpecificFunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by the {@code alterSimpleDatabase}
	 * labeled alternative in {@link MySqlParser#alterDatabase}.
	 * @param ctx the parse tree
	 */
	void enterAlterSimpleDatabase(@NotNull MySqlParser.AlterSimpleDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterSimpleDatabase}
	 * labeled alternative in {@link MySqlParser#alterDatabase}.
	 * @param ctx the parse tree
	 */
	void exitAlterSimpleDatabase(@NotNull MySqlParser.AlterSimpleDatabaseContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#deallocatePrepare}.
	 * @param ctx the parse tree
	 */
	void enterDeallocatePrepare(@NotNull MySqlParser.DeallocatePrepareContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#deallocatePrepare}.
	 * @param ctx the parse tree
	 */
	void exitDeallocatePrepare(@NotNull MySqlParser.DeallocatePrepareContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#fullDescribeStatement}.
	 * @param ctx the parse tree
	 */
	void enterFullDescribeStatement(@NotNull MySqlParser.FullDescribeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#fullDescribeStatement}.
	 * @param ctx the parse tree
	 */
	void exitFullDescribeStatement(@NotNull MySqlParser.FullDescribeStatementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code selectColumnElement}
	 * labeled alternative in {@link MySqlParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void enterSelectColumnElement(@NotNull MySqlParser.SelectColumnElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectColumnElement}
	 * labeled alternative in {@link MySqlParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void exitSelectColumnElement(@NotNull MySqlParser.SelectColumnElementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#setAutocommitStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetAutocommitStatement(@NotNull MySqlParser.SetAutocommitStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#setAutocommitStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetAutocommitStatement(@NotNull MySqlParser.SetAutocommitStatementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code showSchemaFilter}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowSchemaFilter(@NotNull MySqlParser.ShowSchemaFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showSchemaFilter}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowSchemaFilter(@NotNull MySqlParser.ShowSchemaFilterContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#createDatabase}.
	 * @param ctx the parse tree
	 */
	void enterCreateDatabase(@NotNull MySqlParser.CreateDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#createDatabase}.
	 * @param ctx the parse tree
	 */
	void exitCreateDatabase(@NotNull MySqlParser.CreateDatabaseContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#stringMasterOption}.
	 * @param ctx the parse tree
	 */
	void enterStringMasterOption(@NotNull MySqlParser.StringMasterOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#stringMasterOption}.
	 * @param ctx the parse tree
	 */
	void exitStringMasterOption(@NotNull MySqlParser.StringMasterOptionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code detailRevoke}
	 * labeled alternative in {@link MySqlParser#revokeStatement}.
	 * @param ctx the parse tree
	 */
	void enterDetailRevoke(@NotNull MySqlParser.DetailRevokeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code detailRevoke}
	 * labeled alternative in {@link MySqlParser#revokeStatement}.
	 * @param ctx the parse tree
	 */
	void exitDetailRevoke(@NotNull MySqlParser.DetailRevokeContext ctx);

	/**
	 * Enter a parse tree produced by the {@code ignoreTableReplication}
	 * labeled alternative in {@link MySqlParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void enterIgnoreTableReplication(@NotNull MySqlParser.IgnoreTableReplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ignoreTableReplication}
	 * labeled alternative in {@link MySqlParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void exitIgnoreTableReplication(@NotNull MySqlParser.IgnoreTableReplicationContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#showFilter}.
	 * @param ctx the parse tree
	 */
	void enterShowFilter(@NotNull MySqlParser.ShowFilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#showFilter}.
	 * @param ctx the parse tree
	 */
	void exitShowFilter(@NotNull MySqlParser.ShowFilterContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(@NotNull MySqlParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(@NotNull MySqlParser.StringLiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#iterateStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterateStatement(@NotNull MySqlParser.IterateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#iterateStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterateStatement(@NotNull MySqlParser.IterateStatementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code alterUserMysqlV56}
	 * labeled alternative in {@link MySqlParser#alterUser}.
	 * @param ctx the parse tree
	 */
	void enterAlterUserMysqlV56(@NotNull MySqlParser.AlterUserMysqlV56Context ctx);
	/**
	 * Exit a parse tree produced by the {@code alterUserMysqlV56}
	 * labeled alternative in {@link MySqlParser#alterUser}.
	 * @param ctx the parse tree
	 */
	void exitAlterUserMysqlV56(@NotNull MySqlParser.AlterUserMysqlV56Context ctx);

	/**
	 * Enter a parse tree produced by the {@code alterUserMysqlV57}
	 * labeled alternative in {@link MySqlParser#alterUser}.
	 * @param ctx the parse tree
	 */
	void enterAlterUserMysqlV57(@NotNull MySqlParser.AlterUserMysqlV57Context ctx);
	/**
	 * Exit a parse tree produced by the {@code alterUserMysqlV57}
	 * labeled alternative in {@link MySqlParser#alterUser}.
	 * @param ctx the parse tree
	 */
	void exitAlterUserMysqlV57(@NotNull MySqlParser.AlterUserMysqlV57Context ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#privilegesBase}.
	 * @param ctx the parse tree
	 */
	void enterPrivilegesBase(@NotNull MySqlParser.PrivilegesBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#privilegesBase}.
	 * @param ctx the parse tree
	 */
	void exitPrivilegesBase(@NotNull MySqlParser.PrivilegesBaseContext ctx);

	/**
	 * Enter a parse tree produced by the {@code tableOptionEngine}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionEngine(@NotNull MySqlParser.TableOptionEngineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionEngine}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionEngine(@NotNull MySqlParser.TableOptionEngineContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#showGlobalInfoClause}.
	 * @param ctx the parse tree
	 */
	void enterShowGlobalInfoClause(@NotNull MySqlParser.ShowGlobalInfoClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#showGlobalInfoClause}.
	 * @param ctx the parse tree
	 */
	void exitShowGlobalInfoClause(@NotNull MySqlParser.ShowGlobalInfoClauseContext ctx);

	/**
	 * Enter a parse tree produced by the {@code autoIncrementColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterAutoIncrementColumnConstraint(@NotNull MySqlParser.AutoIncrementColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code autoIncrementColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitAutoIncrementColumnConstraint(@NotNull MySqlParser.AutoIncrementColumnConstraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#xaStartTransaction}.
	 * @param ctx the parse tree
	 */
	void enterXaStartTransaction(@NotNull MySqlParser.XaStartTransactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#xaStartTransaction}.
	 * @param ctx the parse tree
	 */
	void exitXaStartTransaction(@NotNull MySqlParser.XaStartTransactionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#dmlStatement}.
	 * @param ctx the parse tree
	 */
	void enterDmlStatement(@NotNull MySqlParser.DmlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#dmlStatement}.
	 * @param ctx the parse tree
	 */
	void exitDmlStatement(@NotNull MySqlParser.DmlStatementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code tableOptionCollate}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionCollate(@NotNull MySqlParser.TableOptionCollateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionCollate}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionCollate(@NotNull MySqlParser.TableOptionCollateContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#serverOption}.
	 * @param ctx the parse tree
	 */
	void enterServerOption(@NotNull MySqlParser.ServerOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#serverOption}.
	 * @param ctx the parse tree
	 */
	void exitServerOption(@NotNull MySqlParser.ServerOptionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#privilege}.
	 * @param ctx the parse tree
	 */
	void enterPrivilege(@NotNull MySqlParser.PrivilegeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#privilege}.
	 * @param ctx the parse tree
	 */
	void exitPrivilege(@NotNull MySqlParser.PrivilegeContext ctx);

	/**
	 * Enter a parse tree produced by the {@code stringDataType}
	 * labeled alternative in {@link MySqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterStringDataType(@NotNull MySqlParser.StringDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringDataType}
	 * labeled alternative in {@link MySqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitStringDataType(@NotNull MySqlParser.StringDataTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#beginWork}.
	 * @param ctx the parse tree
	 */
	void enterBeginWork(@NotNull MySqlParser.BeginWorkContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#beginWork}.
	 * @param ctx the parse tree
	 */
	void exitBeginWork(@NotNull MySqlParser.BeginWorkContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#optimizeTable}.
	 * @param ctx the parse tree
	 */
	void enterOptimizeTable(@NotNull MySqlParser.OptimizeTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#optimizeTable}.
	 * @param ctx the parse tree
	 */
	void exitOptimizeTable(@NotNull MySqlParser.OptimizeTableContext ctx);

	/**
	 * Enter a parse tree produced by the {@code tableOptionEncryption}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionEncryption(@NotNull MySqlParser.TableOptionEncryptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionEncryption}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionEncryption(@NotNull MySqlParser.TableOptionEncryptionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#flushStatement}.
	 * @param ctx the parse tree
	 */
	void enterFlushStatement(@NotNull MySqlParser.FlushStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#flushStatement}.
	 * @param ctx the parse tree
	 */
	void exitFlushStatement(@NotNull MySqlParser.FlushStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#expressionsWithDefaults}.
	 * @param ctx the parse tree
	 */
	void enterExpressionsWithDefaults(@NotNull MySqlParser.ExpressionsWithDefaultsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#expressionsWithDefaults}.
	 * @param ctx the parse tree
	 */
	void exitExpressionsWithDefaults(@NotNull MySqlParser.ExpressionsWithDefaultsContext ctx);

	/**
	 * Enter a parse tree produced by the {@code showProfile}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowProfile(@NotNull MySqlParser.ShowProfileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showProfile}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowProfile(@NotNull MySqlParser.ShowProfileContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#multipleUpdateStatement}.
	 * @param ctx the parse tree
	 */
	void enterMultipleUpdateStatement(@NotNull MySqlParser.MultipleUpdateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#multipleUpdateStatement}.
	 * @param ctx the parse tree
	 */
	void exitMultipleUpdateStatement(@NotNull MySqlParser.MultipleUpdateStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#querySpecificationNointo}.
	 * @param ctx the parse tree
	 */
	void enterQuerySpecificationNointo(@NotNull MySqlParser.QuerySpecificationNointoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#querySpecificationNointo}.
	 * @param ctx the parse tree
	 */
	void exitQuerySpecificationNointo(@NotNull MySqlParser.QuerySpecificationNointoContext ctx);

	/**
	 * Enter a parse tree produced by the {@code setNames}
	 * labeled alternative in {@link MySqlParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetNames(@NotNull MySqlParser.SetNamesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setNames}
	 * labeled alternative in {@link MySqlParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetNames(@NotNull MySqlParser.SetNamesContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#loadXmlStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoadXmlStatement(@NotNull MySqlParser.LoadXmlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#loadXmlStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoadXmlStatement(@NotNull MySqlParser.LoadXmlStatementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code commentColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterCommentColumnConstraint(@NotNull MySqlParser.CommentColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commentColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitCommentColumnConstraint(@NotNull MySqlParser.CommentColumnConstraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#grantProxy}.
	 * @param ctx the parse tree
	 */
	void enterGrantProxy(@NotNull MySqlParser.GrantProxyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#grantProxy}.
	 * @param ctx the parse tree
	 */
	void exitGrantProxy(@NotNull MySqlParser.GrantProxyContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#singleUpdateStatement}.
	 * @param ctx the parse tree
	 */
	void enterSingleUpdateStatement(@NotNull MySqlParser.SingleUpdateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#singleUpdateStatement}.
	 * @param ctx the parse tree
	 */
	void exitSingleUpdateStatement(@NotNull MySqlParser.SingleUpdateStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#leaveStatement}.
	 * @param ctx the parse tree
	 */
	void enterLeaveStatement(@NotNull MySqlParser.LeaveStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#leaveStatement}.
	 * @param ctx the parse tree
	 */
	void exitLeaveStatement(@NotNull MySqlParser.LeaveStatementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code tableOptionDelay}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionDelay(@NotNull MySqlParser.TableOptionDelayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionDelay}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionDelay(@NotNull MySqlParser.TableOptionDelayContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#decimalMasterOption}.
	 * @param ctx the parse tree
	 */
	void enterDecimalMasterOption(@NotNull MySqlParser.DecimalMasterOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#decimalMasterOption}.
	 * @param ctx the parse tree
	 */
	void exitDecimalMasterOption(@NotNull MySqlParser.DecimalMasterOptionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#queryExpression}.
	 * @param ctx the parse tree
	 */
	void enterQueryExpression(@NotNull MySqlParser.QueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#queryExpression}.
	 * @param ctx the parse tree
	 */
	void exitQueryExpression(@NotNull MySqlParser.QueryExpressionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code partitionFunctionRange}
	 * labeled alternative in {@link MySqlParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartitionFunctionRange(@NotNull MySqlParser.PartitionFunctionRangeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionFunctionRange}
	 * labeled alternative in {@link MySqlParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartitionFunctionRange(@NotNull MySqlParser.PartitionFunctionRangeContext ctx);

	/**
	 * Enter a parse tree produced by the {@code expressionAtomPredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAtomPredicate(@NotNull MySqlParser.ExpressionAtomPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionAtomPredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAtomPredicate(@NotNull MySqlParser.ExpressionAtomPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#unionParenthesis}.
	 * @param ctx the parse tree
	 */
	void enterUnionParenthesis(@NotNull MySqlParser.UnionParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#unionParenthesis}.
	 * @param ctx the parse tree
	 */
	void exitUnionParenthesis(@NotNull MySqlParser.UnionParenthesisContext ctx);

	/**
	 * Enter a parse tree produced by the {@code functionCallExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpressionAtom(@NotNull MySqlParser.FunctionCallExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpressionAtom(@NotNull MySqlParser.FunctionCallExpressionAtomContext ctx);

	/**
	 * Enter a parse tree produced by the {@code showMasterLogs}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowMasterLogs(@NotNull MySqlParser.ShowMasterLogsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showMasterLogs}
	 * labeled alternative in {@link MySqlParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowMasterLogs(@NotNull MySqlParser.ShowMasterLogsContext ctx);

	/**
	 * Enter a parse tree produced by the {@code alterByAddColumn}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAddColumn(@NotNull MySqlParser.AlterByAddColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAddColumn}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAddColumn(@NotNull MySqlParser.AlterByAddColumnContext ctx);

	/**
	 * Enter a parse tree produced by the {@code handlerConditionWarning}
	 * labeled alternative in {@link MySqlParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void enterHandlerConditionWarning(@NotNull MySqlParser.HandlerConditionWarningContext ctx);
	/**
	 * Exit a parse tree produced by the {@code handlerConditionWarning}
	 * labeled alternative in {@link MySqlParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void exitHandlerConditionWarning(@NotNull MySqlParser.HandlerConditionWarningContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#singleDeleteStatement}.
	 * @param ctx the parse tree
	 */
	void enterSingleDeleteStatement(@NotNull MySqlParser.SingleDeleteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#singleDeleteStatement}.
	 * @param ctx the parse tree
	 */
	void exitSingleDeleteStatement(@NotNull MySqlParser.SingleDeleteStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#enableType}.
	 * @param ctx the parse tree
	 */
	void enterEnableType(@NotNull MySqlParser.EnableTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#enableType}.
	 * @param ctx the parse tree
	 */
	void exitEnableType(@NotNull MySqlParser.EnableTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#functionNameBase}.
	 * @param ctx the parse tree
	 */
	void enterFunctionNameBase(@NotNull MySqlParser.FunctionNameBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#functionNameBase}.
	 * @param ctx the parse tree
	 */
	void exitFunctionNameBase(@NotNull MySqlParser.FunctionNameBaseContext ctx);

	/**
	 * Enter a parse tree produced by the {@code tableOptionPersistent}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionPersistent(@NotNull MySqlParser.TableOptionPersistentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionPersistent}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionPersistent(@NotNull MySqlParser.TableOptionPersistentContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#declareVariable}.
	 * @param ctx the parse tree
	 */
	void enterDeclareVariable(@NotNull MySqlParser.DeclareVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#declareVariable}.
	 * @param ctx the parse tree
	 */
	void exitDeclareVariable(@NotNull MySqlParser.DeclareVariableContext ctx);

	/**
	 * Enter a parse tree produced by the {@code partitionOptionMinRows}
	 * labeled alternative in {@link MySqlParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void enterPartitionOptionMinRows(@NotNull MySqlParser.PartitionOptionMinRowsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionOptionMinRows}
	 * labeled alternative in {@link MySqlParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void exitPartitionOptionMinRows(@NotNull MySqlParser.PartitionOptionMinRowsContext ctx);

	/**
	 * Enter a parse tree produced by the {@code FetchCursor}
	 * labeled alternative in {@link MySqlParser#cursorStatement}.
	 * @param ctx the parse tree
	 */
	void enterFetchCursor(@NotNull MySqlParser.FetchCursorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FetchCursor}
	 * labeled alternative in {@link MySqlParser#cursorStatement}.
	 * @param ctx the parse tree
	 */
	void exitFetchCursor(@NotNull MySqlParser.FetchCursorContext ctx);

	/**
	 * Enter a parse tree produced by the {@code selectExpressionElement}
	 * labeled alternative in {@link MySqlParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void enterSelectExpressionElement(@NotNull MySqlParser.SelectExpressionElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectExpressionElement}
	 * labeled alternative in {@link MySqlParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void exitSelectExpressionElement(@NotNull MySqlParser.SelectExpressionElementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code simpleAuthOption}
	 * labeled alternative in {@link MySqlParser#userAuthOption}.
	 * @param ctx the parse tree
	 */
	void enterSimpleAuthOption(@NotNull MySqlParser.SimpleAuthOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleAuthOption}
	 * labeled alternative in {@link MySqlParser#userAuthOption}.
	 * @param ctx the parse tree
	 */
	void exitSimpleAuthOption(@NotNull MySqlParser.SimpleAuthOptionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#xid}.
	 * @param ctx the parse tree
	 */
	void enterXid(@NotNull MySqlParser.XidContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#xid}.
	 * @param ctx the parse tree
	 */
	void exitXid(@NotNull MySqlParser.XidContext ctx);

	/**
	 * Enter a parse tree produced by the {@code handlerConditionNotfound}
	 * labeled alternative in {@link MySqlParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void enterHandlerConditionNotfound(@NotNull MySqlParser.HandlerConditionNotfoundContext ctx);
	/**
	 * Exit a parse tree produced by the {@code handlerConditionNotfound}
	 * labeled alternative in {@link MySqlParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void exitHandlerConditionNotfound(@NotNull MySqlParser.HandlerConditionNotfoundContext ctx);

	/**
	 * Enter a parse tree produced by the {@code tableOptionKeyBlockSize}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionKeyBlockSize(@NotNull MySqlParser.TableOptionKeyBlockSizeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionKeyBlockSize}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionKeyBlockSize(@NotNull MySqlParser.TableOptionKeyBlockSizeContext ctx);

	/**
	 * Enter a parse tree produced by the {@code simpleFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterSimpleFunctionCall(@NotNull MySqlParser.SimpleFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitSimpleFunctionCall(@NotNull MySqlParser.SimpleFunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#replicationStatement}.
	 * @param ctx the parse tree
	 */
	void enterReplicationStatement(@NotNull MySqlParser.ReplicationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#replicationStatement}.
	 * @param ctx the parse tree
	 */
	void exitReplicationStatement(@NotNull MySqlParser.ReplicationStatementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code constantExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpressionAtom(@NotNull MySqlParser.ConstantExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpressionAtom(@NotNull MySqlParser.ConstantExpressionAtomContext ctx);

	/**
	 * Enter a parse tree produced by the {@code tableOptionDataDirectory}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionDataDirectory(@NotNull MySqlParser.TableOptionDataDirectoryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionDataDirectory}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionDataDirectory(@NotNull MySqlParser.TableOptionDataDirectoryContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#constants}.
	 * @param ctx the parse tree
	 */
	void enterConstants(@NotNull MySqlParser.ConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#constants}.
	 * @param ctx the parse tree
	 */
	void exitConstants(@NotNull MySqlParser.ConstantsContext ctx);

	/**
	 * Enter a parse tree produced by the {@code alterByRepairPartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByRepairPartition(@NotNull MySqlParser.AlterByRepairPartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByRepairPartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByRepairPartition(@NotNull MySqlParser.AlterByRepairPartitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#selectSpec}.
	 * @param ctx the parse tree
	 */
	void enterSelectSpec(@NotNull MySqlParser.SelectSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#selectSpec}.
	 * @param ctx the parse tree
	 */
	void exitSelectSpec(@NotNull MySqlParser.SelectSpecContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#charsetNameBase}.
	 * @param ctx the parse tree
	 */
	void enterCharsetNameBase(@NotNull MySqlParser.CharsetNameBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#charsetNameBase}.
	 * @param ctx the parse tree
	 */
	void exitCharsetNameBase(@NotNull MySqlParser.CharsetNameBaseContext ctx);

	/**
	 * Enter a parse tree produced by the {@code queryCreateTable}
	 * labeled alternative in {@link MySqlParser#createTable}.
	 * @param ctx the parse tree
	 */
	void enterQueryCreateTable(@NotNull MySqlParser.QueryCreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryCreateTable}
	 * labeled alternative in {@link MySqlParser#createTable}.
	 * @param ctx the parse tree
	 */
	void exitQueryCreateTable(@NotNull MySqlParser.QueryCreateTableContext ctx);

	/**
	 * Enter a parse tree produced by the {@code definiteSchemaPrivLevel}
	 * labeled alternative in {@link MySqlParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void enterDefiniteSchemaPrivLevel(@NotNull MySqlParser.DefiniteSchemaPrivLevelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code definiteSchemaPrivLevel}
	 * labeled alternative in {@link MySqlParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void exitDefiniteSchemaPrivLevel(@NotNull MySqlParser.DefiniteSchemaPrivLevelContext ctx);

	/**
	 * Enter a parse tree produced by the {@code defaultAuthConnectionOption}
	 * labeled alternative in {@link MySqlParser#connectionOption}.
	 * @param ctx the parse tree
	 */
	void enterDefaultAuthConnectionOption(@NotNull MySqlParser.DefaultAuthConnectionOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defaultAuthConnectionOption}
	 * labeled alternative in {@link MySqlParser#connectionOption}.
	 * @param ctx the parse tree
	 */
	void exitDefaultAuthConnectionOption(@NotNull MySqlParser.DefaultAuthConnectionOptionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepeatStatement(@NotNull MySqlParser.RepeatStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepeatStatement(@NotNull MySqlParser.RepeatStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#createTrigger}.
	 * @param ctx the parse tree
	 */
	void enterCreateTrigger(@NotNull MySqlParser.CreateTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#createTrigger}.
	 * @param ctx the parse tree
	 */
	void exitCreateTrigger(@NotNull MySqlParser.CreateTriggerContext ctx);

	/**
	 * Enter a parse tree produced by the {@code alterByLock}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByLock(@NotNull MySqlParser.AlterByLockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByLock}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByLock(@NotNull MySqlParser.AlterByLockContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#mathOperator}.
	 * @param ctx the parse tree
	 */
	void enterMathOperator(@NotNull MySqlParser.MathOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#mathOperator}.
	 * @param ctx the parse tree
	 */
	void exitMathOperator(@NotNull MySqlParser.MathOperatorContext ctx);

	/**
	 * Enter a parse tree produced by the {@code tableOptionConnection}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionConnection(@NotNull MySqlParser.TableOptionConnectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionConnection}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionConnection(@NotNull MySqlParser.TableOptionConnectionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#declareHandler}.
	 * @param ctx the parse tree
	 */
	void enterDeclareHandler(@NotNull MySqlParser.DeclareHandlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#declareHandler}.
	 * @param ctx the parse tree
	 */
	void exitDeclareHandler(@NotNull MySqlParser.DeclareHandlerContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#authPlugin}.
	 * @param ctx the parse tree
	 */
	void enterAuthPlugin(@NotNull MySqlParser.AuthPluginContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#authPlugin}.
	 * @param ctx the parse tree
	 */
	void exitAuthPlugin(@NotNull MySqlParser.AuthPluginContext ctx);

	/**
	 * Enter a parse tree produced by the {@code tableSourceBase}
	 * labeled alternative in {@link MySqlParser#tableSource}.
	 * @param ctx the parse tree
	 */
	void enterTableSourceBase(@NotNull MySqlParser.TableSourceBaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableSourceBase}
	 * labeled alternative in {@link MySqlParser#tableSource}.
	 * @param ctx the parse tree
	 */
	void exitTableSourceBase(@NotNull MySqlParser.TableSourceBaseContext ctx);

	/**
	 * Enter a parse tree produced by the {@code masterStringOption}
	 * labeled alternative in {@link MySqlParser#masterOption}.
	 * @param ctx the parse tree
	 */
	void enterMasterStringOption(@NotNull MySqlParser.MasterStringOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code masterStringOption}
	 * labeled alternative in {@link MySqlParser#masterOption}.
	 * @param ctx the parse tree
	 */
	void exitMasterStringOption(@NotNull MySqlParser.MasterStringOptionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code partitionFunctionHash}
	 * labeled alternative in {@link MySqlParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartitionFunctionHash(@NotNull MySqlParser.PartitionFunctionHashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionFunctionHash}
	 * labeled alternative in {@link MySqlParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartitionFunctionHash(@NotNull MySqlParser.PartitionFunctionHashContext ctx);

	/**
	 * Enter a parse tree produced by the {@code alterByReorganizePartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByReorganizePartition(@NotNull MySqlParser.AlterByReorganizePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByReorganizePartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByReorganizePartition(@NotNull MySqlParser.AlterByReorganizePartitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#functionArgs}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArgs(@NotNull MySqlParser.FunctionArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#functionArgs}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArgs(@NotNull MySqlParser.FunctionArgsContext ctx);

	/**
	 * Enter a parse tree produced by the {@code nullColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterNullColumnConstraint(@NotNull MySqlParser.NullColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitNullColumnConstraint(@NotNull MySqlParser.NullColumnConstraintContext ctx);

	/**
	 * Enter a parse tree produced by the {@code tableOptionInsertMethod}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionInsertMethod(@NotNull MySqlParser.TableOptionInsertMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionInsertMethod}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionInsertMethod(@NotNull MySqlParser.TableOptionInsertMethodContext ctx);

	/**
	 * Enter a parse tree produced by the {@code foreignKeyTableConstraint}
	 * labeled alternative in {@link MySqlParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void enterForeignKeyTableConstraint(@NotNull MySqlParser.ForeignKeyTableConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code foreignKeyTableConstraint}
	 * labeled alternative in {@link MySqlParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void exitForeignKeyTableConstraint(@NotNull MySqlParser.ForeignKeyTableConstraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#startGroupReplication}.
	 * @param ctx the parse tree
	 */
	void enterStartGroupReplication(@NotNull MySqlParser.StartGroupReplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#startGroupReplication}.
	 * @param ctx the parse tree
	 */
	void exitStartGroupReplication(@NotNull MySqlParser.StartGroupReplicationContext ctx);

	/**
	 * Enter a parse tree produced by the {@code setCharset}
	 * labeled alternative in {@link MySqlParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetCharset(@NotNull MySqlParser.SetCharsetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setCharset}
	 * labeled alternative in {@link MySqlParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetCharset(@NotNull MySqlParser.SetCharsetContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#startTransaction}.
	 * @param ctx the parse tree
	 */
	void enterStartTransaction(@NotNull MySqlParser.StartTransactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#startTransaction}.
	 * @param ctx the parse tree
	 */
	void exitStartTransaction(@NotNull MySqlParser.StartTransactionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#referenceControlType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceControlType(@NotNull MySqlParser.ReferenceControlTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#referenceControlType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceControlType(@NotNull MySqlParser.ReferenceControlTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#tlsOption}.
	 * @param ctx the parse tree
	 */
	void enterTlsOption(@NotNull MySqlParser.TlsOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#tlsOption}.
	 * @param ctx the parse tree
	 */
	void exitTlsOption(@NotNull MySqlParser.TlsOptionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code alterByOptimizePartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByOptimizePartition(@NotNull MySqlParser.AlterByOptimizePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByOptimizePartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByOptimizePartition(@NotNull MySqlParser.AlterByOptimizePartitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#checkTable}.
	 * @param ctx the parse tree
	 */
	void enterCheckTable(@NotNull MySqlParser.CheckTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#checkTable}.
	 * @param ctx the parse tree
	 */
	void exitCheckTable(@NotNull MySqlParser.CheckTableContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#uninstallPlugin}.
	 * @param ctx the parse tree
	 */
	void enterUninstallPlugin(@NotNull MySqlParser.UninstallPluginContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#uninstallPlugin}.
	 * @param ctx the parse tree
	 */
	void exitUninstallPlugin(@NotNull MySqlParser.UninstallPluginContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#alterView}.
	 * @param ctx the parse tree
	 */
	void enterAlterView(@NotNull MySqlParser.AlterViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#alterView}.
	 * @param ctx the parse tree
	 */
	void exitAlterView(@NotNull MySqlParser.AlterViewContext ctx);

	/**
	 * Enter a parse tree produced by the {@code alterByAddColumns}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAddColumns(@NotNull MySqlParser.AlterByAddColumnsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAddColumns}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAddColumns(@NotNull MySqlParser.AlterByAddColumnsContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#createEvent}.
	 * @param ctx the parse tree
	 */
	void enterCreateEvent(@NotNull MySqlParser.CreateEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#createEvent}.
	 * @param ctx the parse tree
	 */
	void exitCreateEvent(@NotNull MySqlParser.CreateEventContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#releaseStatement}.
	 * @param ctx the parse tree
	 */
	void enterReleaseStatement(@NotNull MySqlParser.ReleaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#releaseStatement}.
	 * @param ctx the parse tree
	 */
	void exitReleaseStatement(@NotNull MySqlParser.ReleaseStatementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link MySqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(@NotNull MySqlParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link MySqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(@NotNull MySqlParser.LogicalExpressionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code tableOptionAverage}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionAverage(@NotNull MySqlParser.TableOptionAverageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionAverage}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionAverage(@NotNull MySqlParser.TableOptionAverageContext ctx);

	/**
	 * Enter a parse tree produced by the {@code alterByAddPrimaryKey}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAddPrimaryKey(@NotNull MySqlParser.AlterByAddPrimaryKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAddPrimaryKey}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAddPrimaryKey(@NotNull MySqlParser.AlterByAddPrimaryKeyContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#intervalType}.
	 * @param ctx the parse tree
	 */
	void enterIntervalType(@NotNull MySqlParser.IntervalTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#intervalType}.
	 * @param ctx the parse tree
	 */
	void exitIntervalType(@NotNull MySqlParser.IntervalTypeContext ctx);

	/**
	 * Enter a parse tree produced by the {@code getFormatFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterGetFormatFunctionCall(@NotNull MySqlParser.GetFormatFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getFormatFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitGetFormatFunctionCall(@NotNull MySqlParser.GetFormatFunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by the {@code alterByDropIndex}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDropIndex(@NotNull MySqlParser.AlterByDropIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDropIndex}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDropIndex(@NotNull MySqlParser.AlterByDropIndexContext ctx);

	/**
	 * Enter a parse tree produced by {@link MySqlParser#executeStatement}.
	 * @param ctx the parse tree
	 */
	void enterExecuteStatement(@NotNull MySqlParser.ExecuteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#executeStatement}.
	 * @param ctx the parse tree
	 */
	void exitExecuteStatement(@NotNull MySqlParser.ExecuteStatementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code alterByOrder}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByOrder(@NotNull MySqlParser.AlterByOrderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByOrder}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByOrder(@NotNull MySqlParser.AlterByOrderContext ctx);
}