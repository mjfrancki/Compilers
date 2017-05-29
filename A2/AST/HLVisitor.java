/* Generated By:JavaCC: Do not edit this line. HLVisitor.java Version 5.0 */
public interface HLVisitor
{
  public Object visit(SimpleNode node, Object data) throws Exception;
  public Object visit(ASTvar_decl node, Object data) throws Exception;
  public Object visit(ASTident_list node, Object data) throws Exception;
  public Object visit(ASTboolType node, Object data) throws Exception;
  public Object visit(ASTpolType node, Object data) throws Exception;
  public Object visit(ASTintType node, Object data) throws Exception;
  public Object visit(ASTfn_decl node, Object data) throws Exception;
  public Object visit(ASTparam_decls node, Object data) throws Exception;
  public Object visit(ASTparam_decl node, Object data) throws Exception;
  public Object visit(ASTbody node, Object data) throws Exception;
  public Object visit(ASTassignment node, Object data) throws Exception;
  public Object visit(ASTif_stat node, Object data) throws Exception;
  public Object visit(ASTclause node, Object data) throws Exception;
  public Object visit(ASTfor_stat node, Object data) throws Exception;
  public Object visit(ASTforeach_stat node, Object data) throws Exception;
  public Object visit(ASTwhile_stat node, Object data) throws Exception;
  public Object visit(ASTprintfn_call node, Object data) throws Exception;
  public Object visit(ASTprintlnfn_call node, Object data) throws Exception;
  public Object visit(ASTfn_call node, Object data) throws Exception;
  public Object visit(ASTparameters node, Object data) throws Exception;
  public Object visit(ASTstop_stat node, Object data) throws Exception;
  public Object visit(ASTreturn_stat node, Object data) throws Exception;
  public Object visit(ASTNOTHING node, Object data) throws Exception;
  public Object visit(ASTprint_stat node, Object data) throws Exception;
  public Object visit(ASTcomparison node, Object data) throws Exception;
  public Object visit(ASTEQ node, Object data) throws Exception;
  public Object visit(ASTNE node, Object data) throws Exception;
  public Object visit(ASTGE node, Object data) throws Exception;
  public Object visit(ASTGT node, Object data) throws Exception;
  public Object visit(ASTLE node, Object data) throws Exception;
  public Object visit(ASTLT node, Object data) throws Exception;
  public Object visit(ASTisatype node, Object data) throws Exception;
  public Object visit(ASTindexed node, Object data) throws Exception;
  public Object visit(ASTexp node, Object data) throws Exception;
  public Object visit(ASTpolyn node, Object data) throws Exception;
  public Object visit(ASTminus node, Object data) throws Exception;
  public Object visit(ASTtest node, Object data) throws Exception;
  public Object visit(ASTidentifier node, Object data) throws Exception;
  public Object visit(ASTinteger node, Object data) throws Exception;
  public Object visit(ASTbool node, Object data) throws Exception;
  public Object visit(ASTstring node, Object data) throws Exception;
  public Object visit(ASTplus node, Object data) throws Exception;
}
/* JavaCC - OriginalChecksum=2a5e0dcd3661cdb6960aecfcbf440c37 (do not edit this line) */