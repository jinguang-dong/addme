package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lbb {
    public static final int[] a = {38, 37};
    private static final scn b = scn.J(nkw.PHOTO, nkw.NIGHT_SIGHT, nkw.PORTRAIT, nkw.SERENGETI);
    private static final scn c = new sfm(nkw.PORTRAIT);
    private final boolean d;
    private final boolean e;
    private final nms f;

    public lbb(nkw nkwVar, hbj hbjVar, nms nmsVar, boolean z) {
        this.e = z ? c.contains(nkwVar) : b.contains(nkwVar);
        this.d = hbjVar.p(gzs.aV);
        this.f = nmsVar;
    }

    public static pko a(int i, pjo pjoVar, boolean z) {
        pko pkoVarD;
        return (!z || (pkoVarD = d(kqn.e(pjoVar, i, true), i)) == null) ? b(pjoVar, i) : pkoVarD;
    }

    public static pko b(pjo pjoVar, int... iArr) {
        int i = iArr[0];
        pko pkoVarD = d(pjoVar.y(i), i);
        if (pkoVarD != null) {
            return pkoVarD;
        }
        throw new IllegalStateException("No supported output sizes found!!");
    }

    private static pko d(List list, int i) {
        if (list.isEmpty()) {
            return null;
        }
        return new pko(i, ojl.bM(list));
    }

    public final pko c(lcz lczVar, pjo pjoVar, boolean z) {
        boolean z2 = false;
        if (pjoVar.l().equals(pka.BACK) && (lczVar.equals(lcz.RAW_WIDE) || (lczVar.equals(lcz.a) && pjoVar.j().equals(this.f.g().j())))) {
            z2 = true;
        }
        int i = 37;
        if (this.e && !z && this.d && z2) {
            i = 38;
        }
        return a(i, pjoVar, z);
    }
}
