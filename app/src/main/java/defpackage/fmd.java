package defpackage;

import android.content.res.Resources;
import com.google.ar.core.R;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fmd extends lzd {
    public final jtc a;
    private final Resources b;
    private final owf c;
    private final owf d;
    private final ocq e;

    public fmd(ScheduledExecutorService scheduledExecutorService, ocq ocqVar, Resources resources, jtc jtcVar, owf owfVar, owf owfVar2) {
        super(scheduledExecutorService, ocqVar, "all_in_sugesstion_chip", 1);
        this.b = resources;
        this.a = jtcVar;
        this.c = owfVar;
        this.d = owfVar2;
        this.e = ocqVar;
    }

    @Override // defpackage.lzd
    protected final lzc a() {
        Resources resources = this.b;
        lzk lzkVarA = lzl.a();
        lzkVarA.a = resources.getString(R.string.all_in_suggestion);
        lzkVarA.b = resources.getDrawable(R.drawable.gs_group_photo_merge_vd_theme_24, null);
        lzkVarA.f(5000L);
        lzkVarA.c(true);
        lzkVarA.c = new fem(this, 17);
        lzl lzlVarA = lzkVarA.a();
        olm olmVarA = lzc.a();
        olmVarA.b = lzlVarA;
        olmVarA.f(5);
        return olmVarA.e();
    }

    @Override // defpackage.lzd
    protected final boolean b(poe poeVar) {
        return this.e.ai("suggestion_all_in_end_to_end_count") < 3 && ((Integer) this.c.dL()).intValue() >= 3 && ((fne) this.d.dL()).b();
    }
}
