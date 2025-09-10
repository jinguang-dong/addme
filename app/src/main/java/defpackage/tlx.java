package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tlx extends tiv {
    @Override // defpackage.tiv
    public final /* bridge */ /* synthetic */ Object a(tml tmlVar) {
        if (tmlVar.t() == 9) {
            tmlVar.p();
            return null;
        }
        try {
            return Integer.valueOf(tmlVar.c());
        } catch (NumberFormatException e) {
            throw new tis(e);
        }
    }
}
