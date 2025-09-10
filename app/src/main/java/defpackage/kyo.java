package defpackage;

import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kyo extends ojl {
    final /* synthetic */ kyp a;
    private final pdk b;
    private final kml c;
    private final kmk d;
    private final szh e;
    private final gga f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kml] */
    public kyo(kyp kypVar, pdk pdkVar, gga ggaVar, szh szhVar) {
        super((short[]) null);
        this.a = kypVar;
        this.b = pdkVar;
        this.f = ggaVar;
        ?? r1 = ggaVar.a;
        this.c = r1;
        r1.h();
        this.d = r1.c();
        this.e = szhVar;
    }

    @Override // defpackage.ojl
    public final void dI() {
        ((sgt) kyp.a.b().M(3740)).s("onAbort");
        this.e.e(laa.FRAME_ABORTED);
    }

    @Override // defpackage.ojl
    public final void dU(poe poeVar) {
        if (poeVar == null) {
            this.e.e(laa.INVALID_FRAME_METADATA);
        } else {
            poeVar.d();
            poeVar.a(CaptureResult.SENSOR_TIMESTAMP);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [sgt, shi] */
    @Override // defpackage.ojl
    public final void dY() {
        laa laaVar;
        try {
            kyp kypVar = this.a;
            pdk pdkVar = this.b;
            peo peoVar = kypVar.b;
            gga ggaVar = this.f;
            poj pojVarE = pdkVar.e(peoVar);
            poe poeVarD = pdkVar.d();
            if (poeVarD == null) {
                poeVarD = new lba();
            }
            pdkVar.close();
            if (pojVarE == null) {
                ((sgt) kyp.a.b().M(3749)).v("Image available for %s but the image was null!", pdkVar);
                laaVar = laa.INVALID_IMAGE;
            } else {
                try {
                    kle kleVarA = kypVar.c.a(ggaVar);
                    try {
                        kleVarA.a(pojVarE, ske.M(poeVarD));
                        kleVarA.close();
                        laaVar = laa.NO_ERROR;
                    } catch (Throwable th) {
                        try {
                            kleVarA.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (InterruptedException | pco e) {
                    ((sgt) ((sgt) kyp.a.b().i(e)).M((char) 3748)).s("Error saving image.");
                    throw e;
                }
            }
            this.e.e(laaVar);
        } catch (InterruptedException | pco e2) {
            this.e.a(e2);
        }
    }

    @Override // defpackage.ojl
    public final void eP() {
        this.d.h();
    }

    @Override // defpackage.ojl
    public final void dJ() {
    }
}
