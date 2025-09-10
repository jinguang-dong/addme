package defpackage;

import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fcy implements paq {
    public final owq a;
    private final paq b;
    private boolean c;

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, owq] */
    public fcy(jkh jkhVar, hie hieVar, FocusIndicatorView focusIndicatorView, qrh qrhVar, gox goxVar, luj lujVar) {
        fcx fcxVar = fcx.INITIAL;
        ovx ovxVar = new ovx(fcxVar);
        this.a = ovxVar;
        fcx fcxVar2 = ((((Boolean) ((ovx) hieVar.c).d).booleanValue() || jkhVar.b) && ((Boolean) ((ovx) focusIndicatorView.j).d).booleanValue()) ? fcx.AE_AF_LOCKED : (((Boolean) ((ovx) hieVar.c).d).booleanValue() || jkhVar.b) ? fcx.AE_LOCKED : ((Boolean) ((ovx) focusIndicatorView.j).d).booleanValue() ? fcx.AF_LOCKED : fcxVar;
        if (!fcxVar2.equals(fcxVar)) {
            fcxVar2.name();
            ovxVar.a(fcxVar2);
        }
        byte[] bArr = null;
        jkhVar.d = new AmbientMode.AmbientController(this, bArr);
        hieVar.v = new oge((Object) this, (Object) lujVar, bArr);
        focusIndicatorView.O = new AmbientMode.AmbientController(this, bArr);
        this.b = goxVar.b.dK(new gco(this, qrhVar, 1), sxo.a);
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.b.close();
    }
}
