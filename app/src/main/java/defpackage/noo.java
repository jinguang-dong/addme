package defpackage;

import android.widget.VideoView;

/* compiled from: PG */
/* loaded from: classes2.dex */
class noo extends non {
    final /* synthetic */ noq b;

    public noo(noq noqVar) {
        this.b = noqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.non, defpackage.mcz, defpackage.mda
    public final void a() {
        nyr nyrVar = this.b.e;
        if (nyrVar.a) {
            return;
        }
        nyrVar.a = true;
        ((VideoView) nyrVar.d).postDelayed(nyrVar.c, 10L);
    }

    @Override // defpackage.non, defpackage.mcz, defpackage.mda
    public final void b() {
        this.b.e.a = false;
    }

    @Override // defpackage.non
    public void c() {
    }
}
