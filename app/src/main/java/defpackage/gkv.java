package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.view.View;
import com.google.ar.core.R;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gkv implements DialogInterface.OnDismissListener {
    private static final Uri h = Uri.parse("https://www.gstatic.com/aiux/gca/useredu/mountain_original.mp4");
    private static final Uri i = Uri.parse("https://www.gstatic.com/aiux/gca/useredu/mountain_cinematic.mp4");
    public final Executor a;
    public final boolean b;
    public gky c;
    public gky d;
    public boolean e = false;
    public boolean f = false;
    public final muu g;
    private final mni j;
    private final Context k;
    private final ScheduledExecutorService l;
    private moo m;
    private moo n;
    private View o;
    private final mwq p;

    public gkv(mni mniVar, mwq mwqVar, muu muuVar, Context context, Executor executor, ScheduledExecutorService scheduledExecutorService, hbj hbjVar) {
        this.j = mniVar;
        this.p = mwqVar;
        this.g = muuVar;
        this.k = context;
        this.a = executor;
        this.l = scheduledExecutorService;
        this.b = hbjVar.p(gzo.bJ);
    }

    public final void a() {
        this.g.a(this);
    }

    public final void b() {
        if (this.b) {
            return;
        }
        if (this.o == null) {
            this.o = View.inflate(this.k, R.layout.cinematic_bottom_sheet_content, null);
        }
        this.m = (moo) this.o.findViewById(R.id.cinematic_bottom_sheet_normal_video);
        this.n = (moo) this.o.findViewById(R.id.cinematic_bottom_sheet_cinematic_video);
        if (this.c == null || this.d == null) {
            Context context = this.k;
            String string = context.getString(R.string.cinematic_edu_original_video_acc);
            moo mooVar = this.m;
            rwc rwcVarJ = rwc.j(this.n);
            mwq mwqVar = this.p;
            Executor executor = this.a;
            ScheduledExecutorService scheduledExecutorService = this.l;
            this.c = new gky(mooVar, rwcVarJ, mwqVar, context, executor, h, string, scheduledExecutorService, new gku(this, 1));
            this.d = new gky(this.n, rwc.j(this.m), mwqVar, context, executor, i, context.getString(R.string.cinematic_edu_cinematic_video_acc), scheduledExecutorService, new gku(this, 0));
        }
        this.c.g(this.d);
        this.d.g(this.c);
        this.c.b();
        this.d.b();
        this.m.f();
        this.n.g();
        this.j.n(14, R.string.cinematic_bottom_sheet_title, this.o, this);
    }

    public final void c() {
        this.o.findViewById(R.id.cinematic_bottom_sheet_cinematic_caption).setVisibility(0);
        this.o.findViewById(R.id.cinematic_bottom_sheet_normal_caption).setVisibility(0);
    }

    public final void d() {
        this.g.h(this);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.c.d();
        this.d.d();
    }
}
