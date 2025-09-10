package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bdh implements bdg {
    final /* synthetic */ bdg a;
    final /* synthetic */ baz b;

    public bdh(bdg bdgVar, baz bazVar) {
        this.a = bdgVar;
        this.b = bazVar;
    }

    @Override // defpackage.bdg
    public final List a() {
        List listA = this.a.a();
        baz bazVar = this.b;
        int i = bazVar.q;
        return i < 0 ? listA : ske.bJ(bad.m(bazVar, i, Integer.valueOf(bazVar.l(i))), listA);
    }
}
