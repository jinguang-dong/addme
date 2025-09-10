package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;
import com.google.ar.core.R;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lgf extends lzd {
    public final jtc a;
    private final Resources b;
    private final owf c;
    private Rect d;

    public lgf(Resources resources, jtc jtcVar, ocq ocqVar, owf owfVar, ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService, ocqVar, "portrait_smarts_chip");
        this.b = resources;
        this.a = jtcVar;
        this.c = owfVar;
    }

    @Override // defpackage.lzd
    protected final lzc a() {
        Resources resources = this.b;
        lzk lzkVarA = lzl.a();
        lzkVarA.a = resources.getString(R.string.portrait_suggestion_text);
        lzkVarA.b = resources.getDrawable(R.drawable.quantum_gm_ic_portrait_white_24, null);
        lzkVarA.c = new lgc(this, 3);
        lzkVarA.f(5000L);
        lzl lzlVarA = lzkVarA.a();
        olm olmVarA = lzc.a();
        olmVarA.b = lzlVarA;
        olmVarA.f(30);
        olmVarA.g(5);
        return olmVarA.e();
    }

    @Override // defpackage.lzd
    protected final boolean b(poe poeVar) {
        Face[] faceArr = (Face[]) poeVar.a(CaptureResult.STATISTICS_FACES);
        if (faceArr == null) {
            return false;
        }
        int i = 0;
        while (true) {
            int length = faceArr.length;
            if (i >= length) {
                return length > 0 && length <= 1 && ((Float) this.c.dL()).floatValue() >= 1.0f;
            }
            Rect bounds = faceArr[i].getBounds();
            float fWidth = bounds.width();
            Rect rect = this.d;
            rect.getClass();
            float fWidth2 = rect.width();
            float fHeight = bounds.height();
            this.d.getClass();
            if ((fWidth / fWidth2) * (fHeight / r5.height()) < 0.05f) {
                return false;
            }
            i++;
        }
    }

    @Override // defpackage.lzd, defpackage.lzg
    public final void d(pjo pjoVar) {
        super.d(pjoVar);
        this.d = (Rect) pjoVar.m(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
    }
}
