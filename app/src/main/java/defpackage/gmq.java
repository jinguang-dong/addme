package defpackage;

import android.content.SharedPreferences;
import android.content.res.Resources;
import com.google.ar.core.R;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gmq extends lzd {
    public final owq a;
    public final SharedPreferences b;
    public lzm c;
    public final krj d;
    public final hbj e;
    private final gav f;
    private final owf g;
    private final owf h;
    private final owf i;
    private final owf k;
    private final owq l;
    private final Resources m;
    private final ggx n;

    public gmq(ocq ocqVar, krj krjVar, hbj hbjVar, gav gavVar, owf owfVar, owf owfVar2, owf owfVar3, owf owfVar4, ScheduledExecutorService scheduledExecutorService, owq owqVar, SharedPreferences sharedPreferences, Resources resources, owq owqVar2, ggx ggxVar) {
        super(scheduledExecutorService, ocqVar, "p11_video_5x_zoom_smarts_chip", 1);
        this.d = krjVar;
        this.e = hbjVar;
        this.f = gavVar;
        this.g = owfVar;
        this.k = owfVar2;
        this.h = owfVar3;
        this.i = owfVar4;
        this.l = owqVar;
        this.b = sharedPreferences;
        this.m = resources;
        this.a = owqVar2;
        this.n = ggxVar;
    }

    @Override // defpackage.lzd
    protected final lzc a() {
        Resources resources = this.m;
        lzk lzkVarA = lzl.a();
        lzkVarA.a = resources.getString(R.string.video_turn_on_sapphire_dialog_body);
        lzkVarA.b = resources.getDrawable(R.drawable.gs_zoom_in_vd_theme_24, null);
        lzkVarA.f(5000L);
        lzkVarA.c(true);
        lzkVarA.f = new gku(this, 15);
        lzkVarA.c = new gku(this, 16);
        lzkVarA.g = new gku(this, 17);
        lzl lzlVarA = lzkVarA.a();
        olm olmVarA = lzc.a();
        olmVarA.b = lzlVarA;
        olmVarA.f(3);
        return olmVarA.e();
    }

    @Override // defpackage.lzd
    protected final boolean b(poe poeVar) {
        if (!((Boolean) this.a.dL()).booleanValue()) {
            oxh oxhVar = (oxh) this.n.a(nkw.VIDEO).dL();
            boolean z = oxhVar == oxh.FPS_30 || (this.e.p(hax.j) && oxhVar == oxh.FPS_60);
            gav gavVar = this.f;
            boolean zEquals = ((gho) gavVar.a().j.dL()).equals(gho.DEFAULT);
            boolean zEquals2 = ((mhh) gavVar.a().l.dL()).equals(mhh.ON);
            if (z && zEquals && !zEquals2 && ((Float) this.i.dL()).floatValue() >= 5.0f && this.k.dL() == gxj.a && !((Boolean) this.h.dL()).booleanValue() && ((ovx) this.g).d == pka.BACK && !((Boolean) this.l.dL()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.lzd, defpackage.lzh
    public final void eZ(lzm lzmVar) {
        this.c = lzmVar;
        super.eZ(lzmVar);
    }
}
