package defpackage;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.camera2.CaptureResult;
import com.google.ar.core.R;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gmo extends lzd {
    public final ScheduledExecutorService a;
    public final owq b;
    public final SharedPreferences c;
    public final owf d;
    public final jtc e;
    public lzm f;
    public paq g;
    public final krj h;
    public final hbj i;
    private final Resources k;
    private final owf l;
    private final owq m;
    private final owf n;

    public gmo(ScheduledExecutorService scheduledExecutorService, ocq ocqVar, Resources resources, krj krjVar, owf owfVar, owq owqVar, SharedPreferences sharedPreferences, owf owfVar2, owq owqVar2, owf owfVar3, jtc jtcVar, hbj hbjVar) {
        super(scheduledExecutorService, ocqVar, "p11_smarts_chip", 1);
        this.a = scheduledExecutorService;
        this.k = resources;
        this.h = krjVar;
        this.l = owfVar;
        this.m = owqVar;
        this.c = sharedPreferences;
        this.n = owfVar2;
        this.b = owqVar2;
        this.d = owfVar3;
        this.e = jtcVar;
        this.i = hbjVar;
    }

    @Override // defpackage.lzd
    protected final lzc a() {
        int i = true != hax.a(this.i) ? R.string.try_video_boost_smarts : R.string.try_night_sight_video_smarts;
        Resources resources = this.k;
        lzk lzkVarA = lzl.a();
        lzkVarA.a = resources.getString(i);
        lzkVarA.b = resources.getDrawable(R.drawable.ic_night_suggestion_transparent, null);
        lzkVarA.f(5000L);
        lzkVarA.c(true);
        lzkVarA.f = new gku(this, 11);
        lzkVarA.c = new gku(this, 12);
        lzkVarA.g = new gku(this, 13);
        lzl lzlVarA = lzkVarA.a();
        olm olmVarA = lzc.a();
        olmVarA.b = lzlVarA;
        olmVarA.f(9);
        return olmVarA.e();
    }

    @Override // defpackage.lzd
    protected final boolean b(poe poeVar) {
        CaptureResult.Key key;
        Float f;
        if (!((Boolean) this.b.dL()).booleanValue() && this.l.dL() != gxj.b && (key = nvo.A) != null && !((Boolean) this.m.dL()).booleanValue() && !((Boolean) this.n.dL()).booleanValue() && ((ovx) this.d).d == pka.BACK && (f = (Float) poeVar.a(key)) != null) {
            double dG = jsv.G(f.floatValue());
            if (dG < 20.0d && dG > 1.0d) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.lzd, defpackage.lzh
    public final void eZ(lzm lzmVar) {
        this.f = lzmVar;
        super.eZ(lzmVar);
    }
}
