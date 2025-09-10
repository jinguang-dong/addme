package defpackage;

import android.content.res.Resources;
import com.google.ar.core.R;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iwj extends lzd {
    public static final /* synthetic */ int c = 0;
    private static final int d = Math.round(6.0f);
    private static final int e = (int) Math.min(20.0f, 100.0f);
    public final jtc a;
    public Float b;
    private final Resources f;
    private final rww g;
    private final pbn h;
    private Float i;

    public iwj(Resources resources, jtc jtcVar, rww rwwVar, owf owfVar, ScheduledExecutorService scheduledExecutorService, fdq fdqVar, pbn pbnVar, ocq ocqVar) {
        super(scheduledExecutorService, ocqVar, "motion_blur_smarts_chip");
        this.f = resources;
        this.a = jtcVar;
        this.g = rwwVar;
        this.h = pbnVar;
        this.i = Float.valueOf(0.0f);
        this.b = Float.valueOf(1.0f);
        fdqVar.j().d(owfVar.dK(new ijl(this, 16), scheduledExecutorService));
    }

    @Override // defpackage.lzd
    protected final lzc a() {
        Resources resources = this.f;
        lzk lzkVarA = lzl.a();
        lzkVarA.a = resources.getString(R.string.moblur_suggestion_text);
        lzkVarA.b = resources.getDrawable(R.drawable.ic_motion_mode_white, null);
        lzkVarA.c = new ivi(this, 9);
        lzkVarA.g = new iwh(0);
        lzkVarA.f(5000L);
        lzl lzlVarA = lzkVarA.a();
        olm olmVarA = lzc.a();
        olmVarA.b = lzlVarA;
        olmVarA.f(d);
        olmVarA.g(25);
        return olmVarA.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009d  */
    @Override // defpackage.lzd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final boolean b(defpackage.poe r14) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iwj.b(poe):boolean");
    }
}
