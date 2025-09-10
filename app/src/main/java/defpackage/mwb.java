package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mwb {
    public final lrh a;
    public Optional c = Optional.empty();
    public boolean d = false;
    public boolean e = false;
    public final lre b = new lre() { // from class: mwa
        @Override // defpackage.lre
        public final void g(lrf lrfVar) {
            mwb mwbVar = this.a;
            mwbVar.c = Optional.of(lrfVar);
            mwbVar.d = mwb.b(mwbVar.d, -mwbVar.a());
            mwbVar.e = mwb.b(mwbVar.e, mwbVar.a());
        }

        @Override // defpackage.lre
        public final /* synthetic */ void h() {
        }
    };

    public mwb(lrh lrhVar) {
        this.a = lrhVar;
    }

    public static final boolean b(boolean z, float f) {
        return f >= (true != z ? 25.0f : 22.0f);
    }

    public final float a() {
        Optional optional = this.c;
        if (optional == null) {
            return 0.0f;
        }
        return ((Float) optional.map(new maf(8)).orElse(Float.valueOf(0.0f))).floatValue();
    }
}
