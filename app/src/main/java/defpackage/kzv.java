package defpackage;

import android.content.Context;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class kzv implements pau {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ kzv(String str, String str2, String str3, owf owfVar, ovx ovxVar, int i) {
        this.f = i;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = owfVar;
        this.e = ovxVar;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r8v23, types: [java.lang.Object, tzj] */
    @Override // defpackage.pau
    public final void a(Object obj) {
        int i = this.f;
        if (i == 0) {
            List list = (List) obj;
            String str = (String) list.get(0);
            Boolean bool = (Boolean) list.get(1);
            Boolean bool2 = (Boolean) list.get(2);
            if (bool2 != null && bool2.booleanValue() && str.equals(this.a)) {
                str = hbb.a;
            } else if (bool != null && bool.booleanValue()) {
                Object obj2 = this.b;
                if (obj2 == null || !((String) obj2).equals(str)) {
                    Object obj3 = this.c;
                    if (obj3 != null && ((String) obj3).equals(str)) {
                        str = gzc.b;
                    }
                } else {
                    str = gzc.a;
                }
            }
            Object obj4 = this.e;
            this.d.dL();
            ((ovx) obj4).a(str);
            return;
        }
        if (i != 1) {
            List list2 = (List) obj;
            Boolean bool3 = (Boolean) list2.get(0);
            nkw nkwVar = (nkw) list2.get(1);
            boolean zBooleanValue = bool3.booleanValue();
            boolean z = ((lpd) this.a).a;
            nan nanVar = (nan) this.c.a();
            ojl.bf(zBooleanValue, z, nkwVar, (imi) this.d, nanVar, (Context) this.e);
            return;
        }
        luj lujVar = (luj) this.a;
        boolean zBooleanValue2 = ((Boolean) ((ovx) lujVar.a(luf.L)).d).booleanValue();
        Object obj5 = this.b;
        if (zBooleanValue2) {
            if (ihn.f((gnt) this.e, lujVar, (krj) this.d, this.c)) {
                ((nas) obj5).d();
                return;
            }
        }
        ((nas) obj5).b();
    }

    public /* synthetic */ kzv(lpd lpdVar, imi imiVar, tzj tzjVar, Context context, rwc rwcVar, int i) {
        this.f = i;
        this.a = lpdVar;
        this.d = imiVar;
        this.c = tzjVar;
        this.e = context;
        this.b = rwcVar;
    }

    public /* synthetic */ kzv(luj lujVar, gnt gntVar, krj krjVar, owq owqVar, nas nasVar, int i) {
        this.f = i;
        this.a = lujVar;
        this.e = gntVar;
        this.d = krjVar;
        this.c = owqVar;
        this.b = nasVar;
    }
}
