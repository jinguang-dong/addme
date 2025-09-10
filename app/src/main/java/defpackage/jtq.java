package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.camera.faceindicator.FaceIndicatorView;
import com.google.android.apps.camera.ui.hotshot.HotshotController;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jtq {
    public final AccessibilityManager a;
    public final hjb b;
    public final HotshotController c;
    public final jtd d;
    public final rwc e;
    public final boolean f;
    public final boolean g;
    public final kgw h;
    public final ktx i;

    public jtq(AccessibilityManager accessibilityManager, hjb hjbVar, kgw kgwVar, ktx ktxVar, jtd jtdVar, hgc hgcVar, hbj hbjVar, HotshotController hotshotController, rwc rwcVar) {
        accessibilityManager.getClass();
        this.a = accessibilityManager;
        hjbVar.getClass();
        this.b = hjbVar;
        kgwVar.getClass();
        this.h = kgwVar;
        ktxVar.getClass();
        this.i = ktxVar;
        this.d = jtdVar;
        gzi gziVar = gzo.a;
        this.c = hotshotController;
        hgcVar.getClass();
        this.e = rwcVar;
        boolean zP = hbjVar.p(gzt.a);
        this.f = zP;
        boolean z = hbjVar.p(gzj.f) && rwcVar.h();
        this.g = z;
        if (zP) {
            Integer num = (Integer) kgwVar.m(CameraCharacteristics.STATISTICS_INFO_MAX_FACE_COUNT);
            int iIntValue = num == null ? 0 : num.intValue();
            if (iIntValue <= 0) {
                ((sgt) HotshotController.a.c().M(5084)).t("Wrong max faces %d", iIntValue);
            } else {
                hotshotController.B = iIntValue;
            }
            Rect rect = (Rect) kgwVar.m(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            hotshotController.I = rect == null ? new Rect(0, 0, 0, 0) : rect;
        }
        if (z) {
            hko hkoVar = (hko) rwcVar.c();
            int iG = kgwVar.g();
            rwc rwcVar2 = (rwc) hkoVar.c.b;
            if (rwcVar2.h()) {
                ((hkt) rwcVar2.c()).j.d(iG);
            }
            Rect rect2 = (Rect) kgwVar.m(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            ((FaceIndicatorView) ((rwc) ((hko) rwcVar.c()).c.b).c()).e.set(rect2 == null ? new Rect(0, 0, 0, 0) : rect2);
        }
    }

    public final paq a(owf owfVar, out outVar) {
        return owfVar.dK(new pau() { // from class: jtp
            /* JADX WARN: Removed duplicated region for block: B:100:0x023a  */
            /* JADX WARN: Removed duplicated region for block: B:128:0x039c  */
            /* JADX WARN: Removed duplicated region for block: B:129:0x03a0  */
            /* JADX WARN: Removed duplicated region for block: B:146:0x0421  */
            /* JADX WARN: Removed duplicated region for block: B:174:0x0489 A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:179:0x0492  */
            /* JADX WARN: Removed duplicated region for block: B:182:0x04a8  */
            /* JADX WARN: Removed duplicated region for block: B:189:0x04ec  */
            /* JADX WARN: Removed duplicated region for block: B:235:0x05eb  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00d3  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x00ea  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x00ef  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x0102  */
            /* JADX WARN: Removed duplicated region for block: B:54:0x0112  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x011a A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:65:0x0127  */
            /* JADX WARN: Removed duplicated region for block: B:72:0x015a  */
            /* JADX WARN: Removed duplicated region for block: B:73:0x016b  */
            /* JADX WARN: Removed duplicated region for block: B:93:0x01d0  */
            @Override // defpackage.pau
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void a(java.lang.Object r32) {
                /*
                    Method dump skipped, instructions count: 1662
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.jtp.a(java.lang.Object):void");
            }
        }, outVar);
    }

    public final void b(boolean z) {
        if (this.g) {
            ((hko) this.e.c()).f(z);
        }
    }

    public final void c(pas pasVar) {
        if (this.g) {
            ((hko) this.e.c()).b(pasVar);
        }
        if (this.f) {
            this.c.l(pasVar);
            this.b.s = pasVar;
        }
    }
}
