/* Generated By:JJTree&JavaCC: Do not edit this line. HLTokenManager.java */

/** Token Manager. */
public class HLTokenManager implements HLConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x10000000000000L) != 0L)
            return 10;
         if ((active0 & 0xf80000000L) != 0L)
         {
            jjmatchedKind = 58;
            return 6;
         }
         if ((active0 & 0x3000000000000L) != 0L)
         {
            jjmatchedKind = 58;
            return 2;
         }
         if ((active0 & 0x2cfff07f800000L) != 0L)
         {
            jjmatchedKind = 58;
            return 10;
         }
         if ((active0 & 0x100L) != 0L)
            return 11;
         return -1;
      case 1:
         if ((active0 & 0x20c7095000000L) != 0L)
            return 10;
         if ((active0 & 0x2df38f6a800000L) != 0L)
         {
            if (jjmatchedPos != 1)
            {
               jjmatchedKind = 58;
               jjmatchedPos = 1;
            }
            return 10;
         }
         return -1;
      case 2:
         if ((active0 & 0x403cb08800000L) != 0L)
            return 10;
         if ((active0 & 0x29f00462000000L) != 0L)
         {
            if (jjmatchedPos != 2)
            {
               jjmatchedKind = 58;
               jjmatchedPos = 2;
            }
            return 10;
         }
         return -1;
      case 3:
         if ((active0 & 0x1800462000000L) != 0L)
            return 10;
         if ((active0 & 0x28700200000000L) != 0L)
         {
            jjmatchedKind = 58;
            jjmatchedPos = 3;
            return 10;
         }
         return -1;
      case 4:
         if ((active0 & 0x28300000000000L) != 0L)
            return 10;
         if ((active0 & 0x400200000000L) != 0L)
         {
            if (jjmatchedPos != 4)
            {
               jjmatchedKind = 58;
               jjmatchedPos = 4;
            }
            return 10;
         }
         return -1;
      case 5:
         if ((active0 & 0x400000000000L) != 0L)
            return 10;
         if ((active0 & 0x20000200000000L) != 0L)
         {
            jjmatchedKind = 58;
            jjmatchedPos = 5;
            return 10;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 34:
         return jjStopAtPos(0, 59);
      case 40:
         return jjStopAtPos(0, 16);
      case 41:
         return jjStopAtPos(0, 20);
      case 42:
         return jjStopAtPos(0, 18);
      case 43:
         return jjStopAtPos(0, 5);
      case 44:
         return jjStopAtPos(0, 7);
      case 45:
         return jjStopAtPos(0, 22);
      case 47:
         return jjStartNfaWithStates_0(0, 8, 11);
      case 59:
         return jjStopAtPos(0, 21);
      case 60:
         jjmatchedKind = 14;
         return jjMoveStringLiteralDfa1_0(0x22000L);
      case 61:
         jjmatchedKind = 6;
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 62:
         jjmatchedKind = 12;
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 91:
         return jjStopAtPos(0, 15);
      case 93:
         return jjStopAtPos(0, 19);
      case 94:
         return jjStopAtPos(0, 10);
      case 65:
      case 97:
         return jjMoveStringLiteralDfa1_0(0x1800000L);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa1_0(0x6000000L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa1_0(0x18000000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa1_0(0x60000000L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa1_0(0xf80000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa1_0(0xf000000000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa1_0(0x30000000000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa1_0(0xc0000000000L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa1_0(0x20300000000000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa1_0(0x400000000000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa1_0(0x800000000000L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa1_0(0x3000000000000L);
      case 86:
      case 118:
         return jjMoveStringLiteralDfa1_0(0x4000000000000L);
      case 87:
      case 119:
         return jjMoveStringLiteralDfa1_0(0x8000000000000L);
      case 88:
      case 120:
         return jjStartNfaWithStates_0(0, 52, 10);
      default :
         return jjMoveNfa_0(3, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 61:
         if ((active0 & 0x200L) != 0L)
            return jjStopAtPos(1, 9);
         else if ((active0 & 0x800L) != 0L)
            return jjStopAtPos(1, 11);
         else if ((active0 & 0x2000L) != 0L)
            return jjStopAtPos(1, 13);
         break;
      case 62:
         if ((active0 & 0x20000L) != 0L)
            return jjStopAtPos(1, 17);
         break;
      case 65:
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000000000000L);
      case 68:
      case 100:
         if ((active0 & 0x40000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 42, 10);
         break;
      case 69:
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x400008000000L);
      case 70:
      case 102:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 36, 10);
         break;
      case 72:
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x9000000000000L);
      case 73:
      case 105:
         if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(1, 31, 10);
         break;
      case 76:
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x60000000L);
      case 78:
      case 110:
         if ((active0 & 0x2000000000L) != 0L)
         {
            jjmatchedKind = 37;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x4000800000L);
      case 79:
      case 111:
         if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(1, 28, 10);
         else if ((active0 & 0x2000000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 49, 10);
         return jjMoveStringLiteralDfa2_0(active0, 0x110302000000L);
      case 82:
      case 114:
         if ((active0 & 0x80000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 43, 10);
         return jjMoveStringLiteralDfa2_0(active0, 0x20200400000000L);
      case 83:
      case 115:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(1, 24, 10);
         return jjMoveStringLiteralDfa2_0(active0, 0x8000000000L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x800000000000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x20800000000L);
      case 89:
      case 121:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(1, 26, 10);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         if ((active0 & 0x8000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 39, 10);
         break;
      case 67:
      case 99:
         if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(2, 27, 10);
         break;
      case 68:
      case 100:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(2, 23, 10);
         break;
      case 69:
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000000000000L);
      case 70:
      case 102:
         if ((active0 & 0x20000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 41, 10);
         break;
      case 73:
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x28200020000000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000000000L);
      case 78:
      case 110:
         if ((active0 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(2, 35, 10);
         break;
      case 79:
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x800402000000L);
      case 82:
      case 114:
         if ((active0 & 0x100000000L) != 0L)
         {
            jjmatchedKind = 32;
            jjmatchedPos = 2;
         }
         else if ((active0 & 0x4000000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 50, 10);
         return jjMoveStringLiteralDfa3_0(active0, 0x200000000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000000L);
      case 84:
      case 116:
         if ((active0 & 0x4000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 38, 10);
         else if ((active0 & 0x10000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 40, 10);
         return jjMoveStringLiteralDfa3_0(active0, 0x400000000000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 69:
      case 101:
         if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(3, 30, 10);
         return jjMoveStringLiteralDfa4_0(active0, 0x200000000L);
      case 70:
      case 102:
         if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(3, 29, 10);
         break;
      case 76:
      case 108:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(3, 25, 10);
         return jjMoveStringLiteralDfa4_0(active0, 0x8000000000000L);
      case 77:
      case 109:
         if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(3, 34, 10);
         break;
      case 78:
      case 110:
         if ((active0 & 0x1000000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 48, 10);
         return jjMoveStringLiteralDfa4_0(active0, 0x20200000000000L);
      case 80:
      case 112:
         if ((active0 & 0x800000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 47, 10);
         break;
      case 85:
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x400000000000L);
      case 89:
      case 121:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x200000000L);
      case 69:
      case 101:
         if ((active0 & 0x8000000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 51, 10);
         break;
      case 78:
      case 110:
         if ((active0 & 0x100000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 44, 10);
         break;
      case 82:
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x400000000000L);
      case 84:
      case 116:
         if ((active0 & 0x200000000000L) != 0L)
         {
            jjmatchedKind = 45;
            jjmatchedPos = 4;
         }
         return jjMoveStringLiteralDfa5_0(active0, 0x20000000000000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 67:
      case 99:
         return jjMoveStringLiteralDfa6_0(active0, 0x200000000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa6_0(active0, 0x20000000000000L);
      case 78:
      case 110:
         if ((active0 & 0x400000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 46, 10);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 72:
      case 104:
         if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(6, 33, 10);
         break;
      case 78:
      case 110:
         if ((active0 & 0x20000000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 53, 10);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 17;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 6:
               case 10:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 58)
                     kind = 58;
                  jjCheckNAdd(10);
                  break;
               case 2:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 58)
                     kind = 58;
                  jjCheckNAdd(10);
                  break;
               case 3:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 57)
                        kind = 57;
                     jjCheckNAdd(8);
                  }
                  else if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 8:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 57)
                     kind = 57;
                  jjCheckNAdd(8);
                  break;
               case 11:
                  if (curChar == 47)
                     jjCheckNAddStates(0, 2);
                  break;
               case 12:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               case 13:
                  if ((0x2400L & l) != 0L && kind > 71)
                     kind = 71;
                  break;
               case 14:
                  if (curChar == 10 && kind > 71)
                     kind = 71;
                  break;
               case 15:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 14;
                  break;
               case 16:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 6:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 58)
                        kind = 58;
                     jjCheckNAdd(10);
                  }
                  if ((0x200000002L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 2:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 58)
                        kind = 58;
                     jjCheckNAdd(10);
                  }
                  if ((0x4000000040000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 3:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 58)
                        kind = 58;
                     jjCheckNAdd(10);
                  }
                  if ((0x4000000040L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 6;
                  else if ((0x10000000100000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 0:
                  if ((0x2000000020L & l) != 0L && kind > 56)
                     kind = 56;
                  break;
               case 1:
                  if ((0x20000000200000L & l) != 0L)
                     jjCheckNAdd(0);
                  break;
               case 4:
                  if ((0x8000000080000L & l) != 0L)
                     jjCheckNAdd(0);
                  break;
               case 5:
                  if ((0x100000001000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 7:
                  if ((0x4000000040L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 9:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 58)
                     kind = 58;
                  jjCheckNAdd(10);
                  break;
               case 10:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 58)
                     kind = 58;
                  jjCheckNAdd(10);
                  break;
               case 12:
                  jjAddStates(0, 2);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 12:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(0, 2);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 17 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private static final int jjStopStringLiteralDfa_1(int pos, long active0, long active1)
{
   switch (pos)
   {
      default :
         return -1;
   }
}
private static final int jjStartNfa_1(int pos, long active0, long active1)
{
   return jjMoveNfa_1(jjStopStringLiteralDfa_1(pos, active0, active1), pos + 1);
}
static private int jjMoveStringLiteralDfa0_1()
{
   switch(curChar)
   {
      case 34:
         return jjStopAtPos(0, 64);
      case 92:
         return jjMoveStringLiteralDfa1_1(0xf000000000000000L);
      default :
         return jjMoveNfa_1(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_1(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_1(0, active0, 0L);
      return 1;
   }
   switch(curChar)
   {
      case 34:
         if ((active0 & 0x2000000000000000L) != 0L)
            return jjStopAtPos(1, 61);
         break;
      case 92:
         if ((active0 & 0x1000000000000000L) != 0L)
            return jjStopAtPos(1, 60);
         break;
      case 78:
      case 110:
         if ((active0 & 0x8000000000000000L) != 0L)
            return jjStopAtPos(1, 63);
         break;
      case 84:
      case 116:
         if ((active0 & 0x4000000000000000L) != 0L)
            return jjStopAtPos(1, 62);
         break;
      default :
         break;
   }
   return jjStartNfa_1(0, active0, 0L);
}
static private int jjMoveNfa_1(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 6;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x20002f7a00000000L & l) != 0L)
                  {
                     if (kind > 67)
                        kind = 67;
                  }
                  else if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 65)
                        kind = 65;
                  }
                  else if ((0xd000d00100000000L & l) != 0L)
                  {
                     if (kind > 70)
                        kind = 70;
                  }
                  else if ((0xc00008000000000L & l) != 0L)
                  {
                     if (kind > 69)
                        kind = 69;
                  }
                  break;
               case 2:
                  if ((0x20002f7a00000000L & l) != 0L)
                     kind = 67;
                  break;
               case 4:
                  if ((0xc00008000000000L & l) != 0L)
                     kind = 69;
                  break;
               case 5:
                  if ((0xd000d00100000000L & l) != 0L)
                     kind = 70;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 66)
                        kind = 66;
                  }
                  else if ((0x3800000028000000L & l) != 0L)
                  {
                     if (kind > 68)
                        kind = 68;
                  }
                  else if ((0x40000001c0000001L & l) != 0L)
                  {
                     if (kind > 67)
                        kind = 67;
                  }
                  break;
               case 1:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     kind = 66;
                  break;
               case 2:
                  if ((0x40000001c0000001L & l) != 0L)
                     kind = 67;
                  break;
               case 3:
                  if ((0x3800000028000000L & l) != 0L)
                     kind = 68;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 6 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   12, 13, 15, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, "\53", "\75", "\54", "\57", "\75\75", "\136", 
"\76\75", "\76", "\74\75", "\74", "\133", "\50", "\74\76", "\52", "\135", "\51", "\73", 
"\55", null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
   "INSTRING",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, -1, 0, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0x73fffffffffffe1L, 0x1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 0x80L, 
};
static final long[] jjtoSpecial = {
   0x0L, 0x80L, 
};
static final long[] jjtoMore = {
   0xf800000000000000L, 0x7eL, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[17];
static private final int[] jjstateSet = new int[34];
static protected char curChar;
/** Constructor. */
public HLTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public HLTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 17; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 2 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      matchedToken.specialToken = specialToken;
      return matchedToken;
   }

   for (;;)
   {
     switch(curLexState)
     {
       case 0:
         try { input_stream.backup(0);
            while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
               curChar = input_stream.BeginToken();
         }
         catch (java.io.IOException e1) { continue EOFLoop; }
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_0();
         break;
       case 1:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_1();
         break;
     }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
           matchedToken.specialToken = specialToken;
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else if ((jjtoSkip[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
           {
              matchedToken = jjFillToken();
              if (specialToken == null)
                 specialToken = matchedToken;
              else
              {
                 matchedToken.specialToken = specialToken;
                 specialToken = (specialToken.next = matchedToken);
              }
           }
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
      if (jjnewLexState[jjmatchedKind] != -1)
        curLexState = jjnewLexState[jjmatchedKind];
        curPos = 0;
        jjmatchedKind = 0x7fffffff;
        try {
           curChar = input_stream.readChar();
           continue;
        }
        catch (java.io.IOException e1) { }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
   }
  }
}

static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}