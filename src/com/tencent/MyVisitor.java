package com.tencent;

public class MyVisitor extends SqlBaseBaseVisitor<String>{

    public String visitSingleStatement(SqlBaseParser.SingleStatementContext ctx) {
        System.out.println("visitSingleStatement");
        return visitChildren(ctx);
    }

    public String visitSingleExpression(SqlBaseParser.SingleExpressionContext ctx) {
        System.out.println("visitSingleExpression");
        return visitChildren(ctx);
    }

    public String visitSingleTableIdentifier(SqlBaseParser.SingleTableIdentifierContext ctx) {
        System.out.println("visitSingleTableIdentifier");
        return visitChildren(ctx);
    }

    public String visitSingleDataType(SqlBaseParser.SingleDataTypeContext ctx) {
        System.out.println("visitSingleDataType");
        return visitChildren(ctx);
    }

    public String visitStatementDefault(SqlBaseParser.StatementDefaultContext ctx) {
        System.out.println("visitStatementDefault");
        return visitChildren(ctx);
    }

    public String visitUse(SqlBaseParser.UseContext ctx) {
        System.out.println("visitUse");
        return visitChildren(ctx);
    }

    public String visitCreateDatabase(SqlBaseParser.CreateDatabaseContext ctx) {
        System.out.println("visitCreateDatabase");
        return visitChildren(ctx);
    }

    public String visitSetDatabaseProperties(SqlBaseParser.SetDatabasePropertiesContext ctx) {
        System.out.println("visitSetDatabaseProperties");
        return visitChildren(ctx);
    }

    public String visitDropDatabase(SqlBaseParser.DropDatabaseContext ctx) {
        System.out.println("visitDropDatabase");
        return visitChildren(ctx);
    }

    public String visitCreateTableUsing(SqlBaseParser.CreateTableUsingContext ctx) {
        System.out.println("visitCreateTableUsing");
        return visitChildren(ctx);
    }

    public String visitCreateTable(SqlBaseParser.CreateTableContext ctx) {
        System.out.println("visitCreateTable");
        return visitChildren(ctx);
    }

    public String visitCreateTableLike(SqlBaseParser.CreateTableLikeContext ctx) {
        System.out.println("visitCreateTableLike");
        return visitChildren(ctx);
    }

    public String visitAnalyze(SqlBaseParser.AnalyzeContext ctx) {
        System.out.println("visitAnalyze");
        return visitChildren(ctx);
    }

    public String visitRenameTable(SqlBaseParser.RenameTableContext ctx) {
        System.out.println("visitRenameTable");
        return visitChildren(ctx);
    }

    public String visitSetTableProperties(SqlBaseParser.SetTablePropertiesContext ctx) {
        System.out.println("visitSetTableProperties");
        return visitChildren(ctx);
    }

    public String visitUnsetTableProperties(SqlBaseParser.UnsetTablePropertiesContext ctx) {
        System.out.println("visitUnsetTableProperties");
        return visitChildren(ctx);
    }

    public String visitSetTableSerDe(SqlBaseParser.SetTableSerDeContext ctx) {
        System.out.println("visitSetTableSerDe");
        return visitChildren(ctx);
    }

    public String visitAddTablePartition(SqlBaseParser.AddTablePartitionContext ctx) {
        System.out.println("visitAddTablePartition");
        return visitChildren(ctx);
    }

    public String visitRenameTablePartition(SqlBaseParser.RenameTablePartitionContext ctx) {
        System.out.println("visitRenameTablePartition");
        return visitChildren(ctx);
    }

    public String visitDropTablePartitions(SqlBaseParser.DropTablePartitionsContext ctx) {
        System.out.println("visitSDropTablePartitions");
        return visitChildren(ctx);
    }

    public String visitSetTableLocation(SqlBaseParser.SetTableLocationContext ctx) {
        System.out.println("visitSetTableLocation");
        return visitChildren(ctx);
    }

    public String visitRecoverPartitions(SqlBaseParser.RecoverPartitionsContext ctx) {
        System.out.println("visitRecoverPartitions");
        return visitChildren(ctx);
    }

    public String visitDropTable(SqlBaseParser.DropTableContext ctx) {
        System.out.println("visitDropTable");
        return visitChildren(ctx);
    }

    public String visitCreateView(SqlBaseParser.CreateViewContext ctx) {
        System.out.println("visitCreateView");
        return visitChildren(ctx);
    }

    public String visitCreateTempViewUsing(SqlBaseParser.CreateTempViewUsingContext ctx) {
        System.out.println("visitCreateTempViewUsing");
        return visitChildren(ctx);
    }

    public String visitAlterViewQuery(SqlBaseParser.AlterViewQueryContext ctx) {
        System.out.println("visitAlterViewQuery");
        return visitChildren(ctx);
    }

    public String visitCreateFunction(SqlBaseParser.CreateFunctionContext ctx) {
        System.out.println("visitCreateFunction");
        return visitChildren(ctx);
    }

    public String visitDropFunction(SqlBaseParser.DropFunctionContext ctx) {
        System.out.println("visitDropFunction");
        return visitChildren(ctx);
    }

    public String visitExplain(SqlBaseParser.ExplainContext ctx) {
        System.out.println("visitExplain");
        return visitChildren(ctx);
    }

    public String visitShowTables(SqlBaseParser.ShowTablesContext ctx) {
        System.out.println("visitShowTables");
        return visitChildren(ctx);
    }

    public String visitShowDatabases(SqlBaseParser.ShowDatabasesContext ctx) {
        System.out.println("visitShowDatabases");
        return visitChildren(ctx);
    }

    public String visitShowTblProperties(SqlBaseParser.ShowTblPropertiesContext ctx) {
        System.out.println("visitShowTblProperties");
        return visitChildren(ctx);
    }

    public String visitShowColumns(SqlBaseParser.ShowColumnsContext ctx) {
        System.out.println("visitShowColumns");
        return visitChildren(ctx);
    }

    public String visitShowPartitions(SqlBaseParser.ShowPartitionsContext ctx) {
        System.out.println("visitShowPartitions");
        return visitChildren(ctx);
    }

    public String visitShowFunctions(SqlBaseParser.ShowFunctionsContext ctx) {
        System.out.println("visitShowFunctions");
        return visitChildren(ctx);
    }

    public String visitShowCreateTable(SqlBaseParser.ShowCreateTableContext ctx) {
        System.out.println("visitShowCreateTable");
        return visitChildren(ctx);
    }

    public String visitDescribeFunction(SqlBaseParser.DescribeFunctionContext ctx) {
        System.out.println("visitDescribeFunction");
        return visitChildren(ctx);
    }

    public String visitDescribeDatabase(SqlBaseParser.DescribeDatabaseContext ctx) {
        System.out.println("visitDescribeDatabase");
        return visitChildren(ctx);
    }

    public String visitDescribeTable(SqlBaseParser.DescribeTableContext ctx) {
        System.out.println("visitDescribeTable");
        return visitChildren(ctx);
    }

    public String visitRefreshTable(SqlBaseParser.RefreshTableContext ctx) {
        System.out.println("visitRefreshTable");
        return visitChildren(ctx);
    }

    public String visitRefreshResource(SqlBaseParser.RefreshResourceContext ctx) {
        System.out.println("visitRefreshResource");
        return visitChildren(ctx);
    }

    public String visitCacheTable(SqlBaseParser.CacheTableContext ctx) {
        System.out.println("visitCacheTable");
        return visitChildren(ctx);
    }

    public String visitUncacheTable(SqlBaseParser.UncacheTableContext ctx) {
        System.out.println("visitUncacheTable");
        return visitChildren(ctx);
    }

    public String visitClearCache(SqlBaseParser.ClearCacheContext ctx) {
        System.out.println("visitClearCache");
        return visitChildren(ctx);
    }

    public String visitLoadData(SqlBaseParser.LoadDataContext ctx) {
        System.out.println("visitLoadData");
        return visitChildren(ctx);
    }

    public String visitTruncateTable(SqlBaseParser.TruncateTableContext ctx) {
        System.out.println("visitTruncateTable");
        return visitChildren(ctx);
    }

    public String visitRepairTable(SqlBaseParser.RepairTableContext ctx) {
        System.out.println("visitRepairTable");
        return visitChildren(ctx);
    }

    public String visitManageResource(SqlBaseParser.ManageResourceContext ctx) {
        System.out.println("visitManageResource");
        return visitChildren(ctx);
    }

    public String visitFailNativeCommand(SqlBaseParser.FailNativeCommandContext ctx) {
        System.out.println("visitFailNativeCommand");
        return visitChildren(ctx);
    }

    public String visitSetConfiguration(SqlBaseParser.SetConfigurationContext ctx) {
        System.out.println("visitSetConfiguration");
        return visitChildren(ctx);
    }

    public String visitResetConfiguration(SqlBaseParser.ResetConfigurationContext ctx) {
        System.out.println("visitResetConfiguration");
        return visitChildren(ctx);
    }

    public String visitUnsupportedHiveNativeCommands(SqlBaseParser.UnsupportedHiveNativeCommandsContext ctx) {
        System.out.println("visitUnsupportedHiveNativeCommand");
        return visitChildren(ctx);
    }

    public String visitCreateTableHeader(SqlBaseParser.CreateTableHeaderContext ctx) {
        System.out.println("visitCreateTableHeader");
        return visitChildren(ctx);
    }

    public String visitBucketSpec(SqlBaseParser.BucketSpecContext ctx) {
        System.out.println("visitBucketSpec");
        return visitChildren(ctx);
    }

    public String visitSkewSpec(SqlBaseParser.SkewSpecContext ctx) {
        System.out.println("visitSkewSpec");
        return visitChildren(ctx);
    }

    public String visitLocationSpec(SqlBaseParser.LocationSpecContext ctx) {
        System.out.println("visitLocationSpec");
        return visitChildren(ctx);
    }

    public String visitQuery(SqlBaseParser.QueryContext ctx) {
        System.out.println("visitQuery");
        return visitChildren(ctx);
    }

    public String visitInsertInto(SqlBaseParser.InsertIntoContext ctx) {
        System.out.println("visitInsertInto");
        return visitChildren(ctx);
    }

    public String visitPartitionSpecLocation(SqlBaseParser.PartitionSpecLocationContext ctx) {
        System.out.println("visitPartitionSpecLocation");
        return visitChildren(ctx);
    }

    public String visitPartitionSpec(SqlBaseParser.PartitionSpecContext ctx) {
        System.out.println("visitPartitionSpec");
        return visitChildren(ctx);
    }

    public String visitPartitionVal(SqlBaseParser.PartitionValContext ctx) {
        System.out.println("visitPartitionVal");
        return visitChildren(ctx);
    }

    public String visitDescribeFuncName(SqlBaseParser.DescribeFuncNameContext ctx) {
        System.out.println("visitDescribeFuncName");
        return visitChildren(ctx);
    }

    public String visitDescribeColName(SqlBaseParser.DescribeColNameContext ctx) {
        System.out.println("visitDescribeColName");
        return visitChildren(ctx);
    }

    public String visitCtes(SqlBaseParser.CtesContext ctx) {
        System.out.println("visitCtes");
        return visitChildren(ctx);
    }

    public String visitNamedQuery(SqlBaseParser.NamedQueryContext ctx) {
        System.out.println("visitNamedQuery");
        return visitChildren(ctx);
    }

    public String visitTableProvider(SqlBaseParser.TableProviderContext ctx) {
        System.out.println("visitTableProvider");
        return visitChildren(ctx);
    }

    public String visitTablePropertyList(SqlBaseParser.TablePropertyListContext ctx) {
        System.out.println("visitTablePropertyList");
        return visitChildren(ctx);
    }

    public String visitTableProperty(SqlBaseParser.TablePropertyContext ctx) {
        System.out.println("visitTableProperty");
        return visitChildren(ctx);
    }

    public String visitTablePropertyKey(SqlBaseParser.TablePropertyKeyContext ctx) {
        System.out.println("visitTablePropertyKey");
        return visitChildren(ctx);
    }

    public String visitTablePropertyValue(SqlBaseParser.TablePropertyValueContext ctx) {
        System.out.println("visitTablePropertyValue");
        return visitChildren(ctx);
    }

    public String visitConstantList(SqlBaseParser.ConstantListContext ctx) {
        System.out.println("visitConstantList");
        return visitChildren(ctx);
    }

    public String visitNestedConstantList(SqlBaseParser.NestedConstantListContext ctx) {
        System.out.println("visitNestedConstantList");
        return visitChildren(ctx);
    }

    public String visitCreateFileFormat(SqlBaseParser.CreateFileFormatContext ctx) {
        System.out.println("visitCreateFileFormat");
        return visitChildren(ctx);
    }

    public String visitTableFileFormat(SqlBaseParser.TableFileFormatContext ctx) {
        System.out.println("visitTableFileFormat");
        return visitChildren(ctx);
    }

    public String visitGenericFileFormat(SqlBaseParser.GenericFileFormatContext ctx) {
        System.out.println("visitGenericFileFormat");
        return visitChildren(ctx);
    }

    public String visitStorageHandler(SqlBaseParser.StorageHandlerContext ctx) {
        System.out.println("visitStorageHandler");
        return visitChildren(ctx);
    }

    public String visitResource(SqlBaseParser.ResourceContext ctx) {
        System.out.println("visitResource");
        return visitChildren(ctx);
    }

    public String visitSingleInsertQuery(SqlBaseParser.SingleInsertQueryContext ctx) {
        System.out.println("visitSingleInsertQuery");
        return visitChildren(ctx);
    }

    public String visitMultiInsertQuery(SqlBaseParser.MultiInsertQueryContext ctx) {
        System.out.println("visitMultiInsertQuery");
        return visitChildren(ctx);
    }

    public String visitQueryOrganization(SqlBaseParser.QueryOrganizationContext ctx) {
        System.out.println("visitQueryOrganization");
        return visitChildren(ctx);
    }

    public String visitMultiInsertQueryBody(SqlBaseParser.MultiInsertQueryBodyContext ctx) {
        System.out.println("visitMultiInsertQueryBody");
        return visitChildren(ctx);
    }

    public String visitQueryTermDefault(SqlBaseParser.QueryTermDefaultContext ctx) {
        System.out.println("visitQueryTermDefault");
        return visitChildren(ctx);
    }

    public String visitSetOperation(SqlBaseParser.SetOperationContext ctx) {
        System.out.println("visitSetOperation");
        return visitChildren(ctx);
    }

    public String visitQueryPrimaryDefault(SqlBaseParser.QueryPrimaryDefaultContext ctx) {
        System.out.println("visitQueryPrimaryDefault");
        return visitChildren(ctx);
    }

    public String visitTable(SqlBaseParser.TableContext ctx) {
        System.out.println("visitTable");
        return visitChildren(ctx);
    }

    public String visitInlineTableDefault1(SqlBaseParser.InlineTableDefault1Context ctx) {
        System.out.println("visitInlineTableDefault1");
        return visitChildren(ctx);
    }

    public String visitSubquery(SqlBaseParser.SubqueryContext ctx) {
        System.out.println("visitSubquery");
        return visitChildren(ctx);
    }

    public String visitSortItem(SqlBaseParser.SortItemContext ctx) {
        System.out.println("visitSortItem");
        return visitChildren(ctx);
    }

    public String visitQuerySpecification(SqlBaseParser.QuerySpecificationContext ctx) {
        System.out.println("visitQuerySpecification");
        return visitChildren(ctx);
    }

    public String visitFromClause(SqlBaseParser.FromClauseContext ctx) {
        System.out.println("visitFromClause");
        return visitChildren(ctx);
    }

    public String visitAggregation(SqlBaseParser.AggregationContext ctx) {
        System.out.println("visitAggregation");
        return visitChildren(ctx);
    }

    public String visitGroupingSet(SqlBaseParser.GroupingSetContext ctx) {
        System.out.println("visitGroupingSet");
        return visitChildren(ctx);
    }

    public String visitLateralView(SqlBaseParser.LateralViewContext ctx) {
        System.out.println("visitLateralView");
        return visitChildren(ctx);
    }

    public String visitSetQuantifier(SqlBaseParser.SetQuantifierContext ctx) {
        System.out.println("visitSetQuantifier");
        return visitChildren(ctx);
    }

    public String visitRelation(SqlBaseParser.RelationContext ctx) {
        System.out.println("visitRelation");
        return visitChildren(ctx);
    }

    public String visitJoinRelation(SqlBaseParser.JoinRelationContext ctx) {
        System.out.println("visitJoinRelation");
        return visitChildren(ctx);
    }

    public String visitJoinType(SqlBaseParser.JoinTypeContext ctx) {
        System.out.println("visitJoinType");
        return visitChildren(ctx);
    }

    public String visitJoinCriteria(SqlBaseParser.JoinCriteriaContext ctx) {
        System.out.println("visitJoinCriteria");
        return visitChildren(ctx);
    }

    public String visitSample(SqlBaseParser.SampleContext ctx) {
        System.out.println("visitSample");
        return visitChildren(ctx);
    }

    public String visitIdentifierList(SqlBaseParser.IdentifierListContext ctx) {
        System.out.println("visitIdentifierList");
        return visitChildren(ctx);
    }

    public String visitIdentifierSeq(SqlBaseParser.IdentifierSeqContext ctx) {
        System.out.println("visitIdentifierSeq");
        return visitChildren(ctx);
    }

    public String visitOrderedIdentifierList(SqlBaseParser.OrderedIdentifierListContext ctx) {
        return visitChildren(ctx);
    }

    public String visitOrderedIdentifier(SqlBaseParser.OrderedIdentifierContext ctx) {
        return visitChildren(ctx);
    }

    public String visitIdentifierCommentList(SqlBaseParser.IdentifierCommentListContext ctx) {
        return visitChildren(ctx);
    }

    public String visitIdentifierComment(SqlBaseParser.IdentifierCommentContext ctx) {
        return visitChildren(ctx);
    }

    public String visitTableName(SqlBaseParser.TableNameContext ctx) {
        System.out.println("visitTableName: " + ctx.getText());
        return visitChildren(ctx);
    }

    public String visitAliasedQuery(SqlBaseParser.AliasedQueryContext ctx) {
        System.out.println("visitAliasedQuery");
        return visitChildren(ctx);
    }

    public String visitAliasedRelation(SqlBaseParser.AliasedRelationContext ctx) {
        System.out.println("visitAliasedRelation");
        return visitChildren(ctx);
    }

    public String visitInlineTableDefault2(SqlBaseParser.InlineTableDefault2Context ctx) {
        System.out.println("visitInlineTableDefault2");
        return visitChildren(ctx);
    }

    public String visitTableValuedFunction(SqlBaseParser.TableValuedFunctionContext ctx) {
        System.out.println("visitTableValueFunction");
        return visitChildren(ctx);
    }

    public String visitInlineTable(SqlBaseParser.InlineTableContext ctx) {
        System.out.println("visitInlineTable");
        return visitChildren(ctx);
    }

    public String visitRowFormatSerde(SqlBaseParser.RowFormatSerdeContext ctx) {
        System.out.println("visitRowFormatSerde");
        return visitChildren(ctx);
    }

    public String visitRowFormatDelimited(SqlBaseParser.RowFormatDelimitedContext ctx) {
        System.out.println("visitRowFormatDelimited");
        return visitChildren(ctx);
    }

    public String visitTableIdentifier(SqlBaseParser.TableIdentifierContext ctx) {
        System.out.println("visitTableIdentifier: table=" + ctx.table.getText());
        return visitChildren(ctx);
    }

    public String visitNamedExpression(SqlBaseParser.NamedExpressionContext ctx) {
        System.out.println("visitNamedExpression");
        return visitChildren(ctx);
    }

    public String visitNamedExpressionSeq(SqlBaseParser.NamedExpressionSeqContext ctx) {
        System.out.println("visitNamedExpressionSeq");
        return visitChildren(ctx);
    }

    public String visitExpression(SqlBaseParser.ExpressionContext ctx) {
        System.out.println("visitExpression");
        return visitChildren(ctx);
    }

    public String visitLogicalNot(SqlBaseParser.LogicalNotContext ctx) {
        System.out.println("visitLogicalNot");
        return visitChildren(ctx);
    }

    public String visitBooleanDefault(SqlBaseParser.BooleanDefaultContext ctx) {
        System.out.println("visitBooleanDefault");
        return visitChildren(ctx);
    }

    public String visitExists(SqlBaseParser.ExistsContext ctx) {
        System.out.println("visitExists");
        return visitChildren(ctx);
    }

    public String visitLogicalBinary(SqlBaseParser.LogicalBinaryContext ctx) {
        System.out.println("visitLogicalBinary");
        return visitChildren(ctx);
    }

    public String visitPredicated(SqlBaseParser.PredicatedContext ctx) {
        System.out.println("visitPredicated");
        return visitChildren(ctx);
    }

    public String visitPredicate(SqlBaseParser.PredicateContext ctx) {
        System.out.println("visitPredicate");
        return visitChildren(ctx);
    }

    public String visitValueExpressionDefault(SqlBaseParser.ValueExpressionDefaultContext ctx) {
        System.out.println("visitValueExpressionDefault");
        return visitChildren(ctx);
    }

    public String visitComparison(SqlBaseParser.ComparisonContext ctx) {
        System.out.println("visitComparison");
        return visitChildren(ctx);
    }

    public String visitArithmeticBinary(SqlBaseParser.ArithmeticBinaryContext ctx) {
        System.out.println("visitArithmeticBinary: operator=" + ctx.operator.getText() + ctx.operator.getType());
        return visitChildren(ctx);
    }

    public String visitArithmeticUnary(SqlBaseParser.ArithmeticUnaryContext ctx) {
        System.out.println("visitArithmeticUnary " + ctx.operator);
        return visitChildren(ctx);
    }

    public String visitDereference(SqlBaseParser.DereferenceContext ctx) {
        System.out.println("visitDereference");
        return visitChildren(ctx);
    }
    
    public String visitSimpleCase(SqlBaseParser.SimpleCaseContext ctx) {
        System.out.println("visitSimpleCase");
        return visitChildren(ctx);
    }

    public String visitColumnReference(SqlBaseParser.ColumnReferenceContext ctx) {
        System.out.println("visitColumnReference");
        return visitChildren(ctx);
    }

    public String visitRowConstructor(SqlBaseParser.RowConstructorContext ctx) {
        System.out.println("visitRowConstructor");
        return visitChildren(ctx);
    }

    public String visitStar(SqlBaseParser.StarContext ctx) {
        System.out.println("visitStar");
        return visitChildren(ctx);
    }

    public String visitSubscript(SqlBaseParser.SubscriptContext ctx) {
        System.out.println("visitSubscript");
        return visitChildren(ctx);
    }

    public String visitTimeFunctionCall(SqlBaseParser.TimeFunctionCallContext ctx) {
        System.out.println("visitTimeFunctionCall");
        return visitChildren(ctx);
    }

    public String visitSubqueryExpression(SqlBaseParser.SubqueryExpressionContext ctx) {
        System.out.println("visitSubqueryExpression");
        return visitChildren(ctx);
    }

    public String visitCast(SqlBaseParser.CastContext ctx) {
        System.out.println("visitCast");
        return visitChildren(ctx);
    }

    public String visitConstantDefault(SqlBaseParser.ConstantDefaultContext ctx) {
        System.out.println("visitConstantDefault");
        return visitChildren(ctx);
    }

    public String visitParenthesizedExpression(SqlBaseParser.ParenthesizedExpressionContext ctx) {
        System.out.println("visitParenthesizedExpression");
        return visitChildren(ctx);
    }

    public String visitFunctionCall(SqlBaseParser.FunctionCallContext ctx) {
        System.out.println("visitFunctionCall: " + ctx.getText() + " | qualifiedName="
                + ctx.qualifiedName().getText() + ctx.expression(0).getText());
        return visitChildren(ctx);
    }

    public String visitSearchedCase(SqlBaseParser.SearchedCaseContext ctx) {
        System.out.println("visitSearchedCase");
        return visitChildren(ctx);
    }

    public String visitNullLiteral(SqlBaseParser.NullLiteralContext ctx) {
        System.out.println("visitNullLiteral");
        return visitChildren(ctx);
    }

    public String visitIntervalLiteral(SqlBaseParser.IntervalLiteralContext ctx) {
        System.out.println("visitIntervalLiteral");
        return visitChildren(ctx);
    }

    public String visitTypeConstructor(SqlBaseParser.TypeConstructorContext ctx) {
        System.out.println("visitTypeConstructor");
        return visitChildren(ctx);
    }

    public String visitNumericLiteral(SqlBaseParser.NumericLiteralContext ctx) {
        System.out.println("visitNumericLiteral");
        return visitChildren(ctx);
    }

    public String visitBooleanLiteral(SqlBaseParser.BooleanLiteralContext ctx) {
        System.out.println("visitBooleanLiteral");
        return visitChildren(ctx);
    }

    public String visitStringLiteral(SqlBaseParser.StringLiteralContext ctx) {
        System.out.println("visitStringLiteral");
        return visitChildren(ctx);
    }

    public String visitComparisonOperator(SqlBaseParser.ComparisonOperatorContext ctx) {
        System.out.println("visitComparisonOperator");
        return visitChildren(ctx);
    }

    public String visitArithmeticOperator(SqlBaseParser.ArithmeticOperatorContext ctx) {
        System.out.println("visitArithmeticOperator");
        return visitChildren(ctx);
    }

    public String visitPredicateOperator(SqlBaseParser.PredicateOperatorContext ctx) {
        System.out.println("visitPredicateOperator");
        return visitChildren(ctx);
    }

    public String visitBooleanValue(SqlBaseParser.BooleanValueContext ctx) {
        System.out.println("visitBooleanValue");
        return visitChildren(ctx);
    }

    public String visitInterval(SqlBaseParser.IntervalContext ctx) {
        System.out.println("visitInterval");
        return visitChildren(ctx);
    }

    public String visitIntervalField(SqlBaseParser.IntervalFieldContext ctx) {
        System.out.println("visitIntervalField");
        return visitChildren(ctx);
    }

    public String visitIntervalValue(SqlBaseParser.IntervalValueContext ctx) {
        System.out.println("visitIntervalValue");
        return visitChildren(ctx);
    }

    public String visitComplexDataType(SqlBaseParser.ComplexDataTypeContext ctx) {
        System.out.println("visitComplexDataType");
        return visitChildren(ctx);
    }

    public String visitPrimitiveDataType(SqlBaseParser.PrimitiveDataTypeContext ctx) {
        System.out.println("visitPrimitiveDataType");
        return visitChildren(ctx);
    }

    public String visitColTypeList(SqlBaseParser.ColTypeListContext ctx) {
        System.out.println("visitColTypeList");
        return visitChildren(ctx);
    }

    public String visitColType(SqlBaseParser.ColTypeContext ctx) {
        System.out.println("visitColType");
        return visitChildren(ctx);
    }

    public String visitComplexColTypeList(SqlBaseParser.ComplexColTypeListContext ctx) {
        System.out.println("visitComplexColTypeList");
        return visitChildren(ctx);
    }

    public String visitComplexColType(SqlBaseParser.ComplexColTypeContext ctx) {
        System.out.println("visitComplexColType");
        return visitChildren(ctx);
    }

    public String visitWhenClause(SqlBaseParser.WhenClauseContext ctx) {
        System.out.println("visitWhenClause");
        return visitChildren(ctx);
    }

    public String visitWindows(SqlBaseParser.WindowsContext ctx) {
        System.out.println("visitWindows");
        return visitChildren(ctx);
    }

    public String visitNamedWindow(SqlBaseParser.NamedWindowContext ctx) {
        System.out.println("visitNamedWindow");
        return visitChildren(ctx);
    }

    public String visitWindowRef(SqlBaseParser.WindowRefContext ctx) {
        System.out.println("visitWindowRef");
        return visitChildren(ctx);
    }

    public String visitWindowDef(SqlBaseParser.WindowDefContext ctx) {
        System.out.println("visitWindowDef");
        return visitChildren(ctx);
    }

    public String visitWindowFrame(SqlBaseParser.WindowFrameContext ctx) {
        System.out.println("visitWindowFrame");
        return visitChildren(ctx);
    }

    public String visitFrameBound(SqlBaseParser.FrameBoundContext ctx) {
        System.out.println("visitFrameBound");
        return visitChildren(ctx);
    }

    public String visitQualifiedName(SqlBaseParser.QualifiedNameContext ctx) {
        System.out.println("visitQualifiedName");
        return visitChildren(ctx);
    }

    public String visitIdentifier(SqlBaseParser.IdentifierContext ctx) {
        System.out.println("visitIdentifier");
        return visitChildren(ctx);
    }

    public String visitUnquotedIdentifier(SqlBaseParser.UnquotedIdentifierContext ctx) {
        System.out.println("visitUnquotedIdentifier");
        return visitChildren(ctx);
    }

    public String visitQuotedIdentifierAlternative(SqlBaseParser.QuotedIdentifierAlternativeContext ctx) {
        System.out.println("visitQuotedIdentifierAlternative");
        return visitChildren(ctx);
    }

    public String visitQuotedIdentifier(SqlBaseParser.QuotedIdentifierContext ctx) {
        System.out.println("visitQuotedIdentifer");
        return visitChildren(ctx);
    }

    public String visitDecimalLiteral(SqlBaseParser.DecimalLiteralContext ctx) {
        System.out.println("visitDecimalLiteral");
        return visitChildren(ctx);
    }

    public String visitIntegerLiteral(SqlBaseParser.IntegerLiteralContext ctx) {
        System.out.println("visitIntegerLiteral");
        return visitChildren(ctx);
    }

    public String visitBigIntLiteral(SqlBaseParser.BigIntLiteralContext ctx) {
        System.out.println("visitBigIntLiteral");
        return visitChildren(ctx);
    }

    public String visitSmallIntLiteral(SqlBaseParser.SmallIntLiteralContext ctx) {
        System.out.println("visitSmallIntLiteral");
        return visitChildren(ctx);
    }

    public String visitTinyIntLiteral(SqlBaseParser.TinyIntLiteralContext ctx) {
        System.out.println("visitTinyIntLiteral");
        return visitChildren(ctx);
    }

    public String visitDoubleLiteral(SqlBaseParser.DoubleLiteralContext ctx) {
        System.out.println("visitDoubleLiteral");
        return visitChildren(ctx);
    }

    public String visitBigDecimalLiteral(SqlBaseParser.BigDecimalLiteralContext ctx) {
        System.out.println("visitBigDecimalLiteral");
        return visitChildren(ctx);
    }

    public String visitNonReserved(SqlBaseParser.NonReservedContext ctx) {
        System.out.println("visitNonReserved");
        return visitChildren(ctx);
    }
}