package defpackage;

import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class few extends ojl {
    private final uem a;
    private final syu b;
    private final khb c;
    private long d;

    public few(syu syuVar, khb khbVar, uem uemVar) {
        super((short[]) null);
        this.c = khbVar;
        this.b = syuVar;
        this.a = uemVar;
        this.d = 0L;
    }

    @Override // defpackage.ojl
    public final void a(poe poeVar) {
        Integer num;
        fel felVar = (fel) ojl.ci(this.b);
        if (felVar == null || !felVar.i()) {
            return;
        }
        long jD = poeVar.d();
        long j = this.d;
        int iA = felVar.a();
        if (iA == 0 || jD <= j + iA || (num = (Integer) poeVar.a(CaptureResult.CONTROL_AF_MODE)) == null) {
            return;
        }
        int iIntValue = num.intValue();
        Integer num2 = (Integer) poeVar.a(CaptureResult.CONTROL_AF_STATE);
        num2.getClass();
        int iIntValue2 = num2.intValue();
        if (iIntValue == 0 || iIntValue2 == 2 || iIntValue2 == 4) {
            this.d = poeVar.d();
            this.c.b((kgz) this.a.a());
        }
    }
}
