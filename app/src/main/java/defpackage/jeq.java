package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import com.google.android.apps.lightcycle.panorama.LightCycleNative;
import com.google.ar.core.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jeq {
    public ArrayList a;
    public final jfc b;
    public long c;
    public jfd d;
    public final Point e;
    public int f = 0;
    public boolean g;
    public boolean h;
    public boolean i;

    public jeq(Context context, jfc jfcVar, int i, int i2) {
        this.g = false;
        this.h = false;
        this.i = false;
        try {
            this.d = new jfd();
        } catch (jds e) {
            e.printStackTrace();
        }
        if (this.a == null) {
            this.a = new ArrayList();
        }
        int[] iArr = {R.drawable.focus_quadrant_4, R.drawable.focus_quadrant_1, R.drawable.focus_quadrant_2, R.drawable.focus_quadrant_3, R.drawable.focus_quadrant_4};
        this.a.clear();
        for (int i3 = 0; i3 < 5; i3++) {
            this.a.add(i3, new jdv());
            ((jdv) this.a.get(i3)).g(context, iArr[i3], 4.0f);
            ((jdv) this.a.get(i3)).e = this.d;
        }
        this.b = jfcVar;
        this.e = new Point((i / 2) - (((jdv) this.a.get(0)).g.x / 2), (i2 / 2) - (((jdv) this.a.get(0)).g.y / 2));
        this.h = false;
        this.g = false;
        this.i = true;
    }

    public final void a() {
        this.f = 0;
        if (this.g) {
            jfc jfcVar = this.b;
            int i = jfcVar.h;
            float[] fArrE = jfcVar.e();
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() - this.c;
            Object obj = jeb.a;
            LightCycleNative.EndGyroCalibration(fArrE, i, (int) (jElapsedRealtimeNanos / 1000000.0d));
            this.g = false;
        }
    }
}
