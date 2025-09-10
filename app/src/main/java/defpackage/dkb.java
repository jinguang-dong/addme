package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dkb extends bij implements bxd, bun, bjy {
    public static List a = new ArrayList();
    public static final List b = new ArrayList();
    public boolean c = true;
    public uiq d = null;
    private final String f = "HFCTraversalKey";
    public boolean e = true;

    @Override // defpackage.bij
    public final void cW() {
        f();
    }

    @Override // defpackage.bij
    public final void cZ() {
        a.remove(this);
    }

    public final dkb d() {
        ujw ujwVar = new ujw();
        uka ukaVar = new uka();
        bad.B(this, new aff(ujwVar, ukaVar, 16));
        return !ujwVar.a ? this : (dkb) ukaVar.a;
    }

    @Override // defpackage.bxd
    public final /* synthetic */ Object dc() {
        return this.f;
    }

    public final List e() {
        dkb dkbVar = (dkb) bad.y(this);
        return ske.bK(dkbVar != null ? dkbVar.e() : ufw.a, this);
    }

    public final void f() {
        b.add(this);
        J(new uif() { // from class: dka
            /* JADX WARN: Code restructure failed: missing block: B:164:0x0117, code lost:
            
                continue;
             */
            @Override // defpackage.uif
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a() {
                /*
                    Method dump skipped, instructions count: 458
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dka.a():java.lang.Object");
            }
        });
    }
}
