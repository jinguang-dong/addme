package defpackage;

import androidx.wear.ambient.AmbientMode;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hrg implements mcw {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ hrg(AmbientMode.AmbientController ambientController, tzj tzjVar, owf owfVar, int i) {
        this.d = i;
        this.c = ambientController;
        this.b = tzjVar;
        this.a = owfVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, tzj] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, owq] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        if (i == 0) {
            ((out) this.a).execute(new hdk(this.b, this.c, 11, null));
            return;
        }
        if (i == 1) {
            lzh lzhVar = (lzh) this.b.a();
            lzi lziVarA = lzj.a();
            lziVarA.a = "SelfieAngleAdvice";
            lziVarA.c(new sfm(nkw.PHOTO));
            lziVarA.b(new sfm(pka.FRONT));
            lziVarA.d(true);
            lziVarA.b = this.a;
            ((AmbientMode.AmbientController) this.c).b(lzhVar, lziVarA.a());
            return;
        }
        if (i == 2) {
            ((out) this.a).execute(new imf(this.c, this.b, 3));
            return;
        }
        if (i == 3) {
            jmo jmoVar = (jmo) this.b.a();
            Object obj = this.a;
            ((lsp) obj).a(jmoVar);
            rwc rwcVar = jmoVar.c;
            if (rwcVar.h()) {
                ((mac) rwcVar.c()).a(jmoVar.e);
                jmoVar.a.set(true);
            }
            ((fdq) this.c).j().d(new ffx(obj, jmoVar, 18, null));
            return;
        }
        if (i == 4) {
            our ourVarJ = ((fdq) this.a).j();
            Object obj2 = this.c;
            obj2.getClass();
            ourVarJ.d(this.b.dK(new juf(obj2, 8), ojl.ce()));
            return;
        }
        if (i != 5) {
            ((out) this.b).execute(new mzq(this.c, this.a, 10));
        } else {
            ((fdq) this.b).j().d(new hty(this.c, this.a, 19));
        }
    }

    public /* synthetic */ hrg(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ hrg(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ hrg(out outVar, jgt jgtVar, tzj tzjVar, int i) {
        this.d = i;
        this.a = outVar;
        this.c = jgtVar;
        this.b = tzjVar;
    }

    public /* synthetic */ hrg(uem uemVar, lsp lspVar, fdq fdqVar, int i) {
        this.d = i;
        this.b = uemVar;
        this.a = lspVar;
        this.c = fdqVar;
    }
}
