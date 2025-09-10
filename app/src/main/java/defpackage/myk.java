package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class myk implements mob {
    final /* synthetic */ myl a;

    public myk(myl mylVar) {
        this.a = mylVar;
    }

    @Override // defpackage.mob
    public final boolean c() {
        myl mylVar = this.a;
        jsv.J(mylVar.f != null, mylVar.d);
        nbb nbbVar = mylVar.f;
        if (nbbVar == null) {
            return false;
        }
        if (nbbVar.isShowing()) {
            nbb nbbVar2 = mylVar.f;
            nbbVar2.getClass();
            nbbVar2.dismiss();
        } else {
            nbb nbbVar3 = mylVar.f;
            nbbVar3.getClass();
            nbbVar3.g();
        }
        return true;
    }

    @Override // defpackage.mob
    public final boolean d() {
        return true;
    }

    @Override // defpackage.mob
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.mob
    public final void b() {
    }
}
