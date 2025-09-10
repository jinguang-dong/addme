package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbt extends ujq implements uiu {
    private final /* synthetic */ int f;
    public static final cbt e = new cbt(4);
    public static final cbt d = new cbt(3);
    public static final cbt c = new cbt(2);
    public static final cbt b = new cbt(1);
    public static final cbt a = new cbt(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbt(int i) {
        super(2);
        this.f = i;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        String str;
        uep uepVar;
        int i = this.f;
        if (i == 0) {
            Float f = (Float) obj;
            ((Number) obj2).floatValue();
            return f;
        }
        if (i == 1) {
            List list = (List) obj;
            List list2 = (List) obj2;
            if (list == null) {
                return list2;
            }
            List listBP = ske.bP(list);
            listBP.addAll(list2);
            return listBP;
        }
        if (i == 2) {
            return (String) obj;
        }
        if (i == 3) {
            Boolean bool = (Boolean) obj;
            ((Boolean) obj2).booleanValue();
            return bool;
        }
        cbc cbcVar = (cbc) obj;
        cbc cbcVar2 = (cbc) obj2;
        if (cbcVar == null || (str = cbcVar.a) == null) {
            str = cbcVar2.a;
        }
        if (cbcVar == null || (uepVar = cbcVar.b) == null) {
            uepVar = cbcVar2.b;
        }
        return new cbc(str, uepVar);
    }
}
