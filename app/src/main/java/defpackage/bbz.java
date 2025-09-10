package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bbz extends bdf {
    public static final bbz a = new bbz();

    private bbz() {
        super(0, 2, 1);
    }

    @Override // defpackage.bdf
    protected final void a(bdi bdiVar, axr axrVar, baz bazVar, bfn bfnVar, bdg bdgVar) {
        int i = ((bfi) bdiVar.c(0)).a;
        List list = (List) bdiVar.c(1);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            int i3 = i + i2;
            axrVar.i(i3, obj);
            axrVar.j(i3, obj);
        }
    }
}
