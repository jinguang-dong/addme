package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ksw implements pau {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ ksw(owq owqVar, fuf fufVar, owf owfVar, krj krjVar, int i) {
        this.e = i;
        this.a = owqVar;
        this.b = fufVar;
        this.c = owfVar;
        this.d = krjVar;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, pdv] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, pbr] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, owq] */
    @Override // defpackage.pau
    public final void a(Object obj) {
        int i = this.e;
        if (i == 0) {
            sgv sgvVar = ktb.a;
            if (((Boolean) obj).booleanValue()) {
                ?? r4 = this.a;
                if (Objects.equals(r4.dL(), ksa.PHOTO_FLASH_ON)) {
                    ?? r0 = this.c;
                    if (((fuf) this.b).a((nkw) r0.dL())) {
                        ((sgt) ktb.a.c().M(3432)).s("MenuItemModule.FrontPhotoFlash: fallback to ANS");
                        r4.a(ksa.PHOTO_FLASH_NS);
                    }
                }
            }
            ((krj) this.d).m(false, krs.FRONT_PHOTO_FLASH);
            return;
        }
        if (i == 1) {
            sgv sgvVar2 = ktb.a;
            if (!((Boolean) obj).booleanValue()) {
                ?? r42 = this.a;
                if (ksa.PHOTO_FLASH_ON.equals(r42.dL())) {
                    ?? r02 = this.c;
                    if (((fuf) this.b).a((nkw) r02.dL())) {
                        ((sgt) ktb.a.c().M(3431)).s("MenuItemModule.BackPhotoFlash: fallback to ANS");
                        r42.a(ksa.PHOTO_FLASH_NS);
                    }
                }
            }
            ((krj) this.d).m(false, krs.BACK_PHOTO_FLASH);
            return;
        }
        if (i != 2) {
            qpt.ca((pfu) this.a, kzz.c((kit) this.b.dL()), (jjq) this.d.dL(), this.c);
            return;
        }
        Boolean bool = (Boolean) obj;
        ((lcu) this.a.a()).fr().d();
        this.d.dL();
        this.c.c(bool.booleanValue() ? 1 : 0);
        ((lpm) this.b).a(bool.booleanValue());
    }

    public /* synthetic */ ksw(pfu pfuVar, owf owfVar, owf owfVar2, owf owfVar3, int i) {
        this.e = i;
        this.a = pfuVar;
        this.b = owfVar;
        this.d = owfVar2;
        this.c = owfVar3;
    }

    public /* synthetic */ ksw(uem uemVar, owf owfVar, pbr pbrVar, lpm lpmVar, int i) {
        this.e = i;
        this.a = uemVar;
        this.d = owfVar;
        this.c = pbrVar;
        this.b = lpmVar;
    }
}
