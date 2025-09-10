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
public final class glb implements DialogInterface.OnDismissListener {
    private static final Uri i = Uri.parse("https://www.gstatic.com/aiux/gca/experimental/sdr_peppers.mp4");
    private static final Uri j = Uri.parse("https://www.gstatic.com/aiux/gca/experimental/hdr_peppers.mp4");
    public final mni a;
    public final Context b;
    public final Executor c;
    public gky d;
    public gky e;
    public boolean f = false;
    public boolean g = false;
    public final hbj h;
    private final ScheduledExecutorService k;
    private moo l;
    private moo m;
    private View n;
    private final mwq o;

    public glb(mni mniVar, mwq mwqVar, Context context, Executor executor, ScheduledExecutorService scheduledExecutorService, hbj hbjVar) {
        this.a = mniVar;
        this.o = mwqVar;
        this.b = context;
        this.c = executor;
        this.k = scheduledExecutorService;
        this.h = hbjVar;
    }

    public final void a() {
        if (this.n == null) {
            this.n = View.inflate(this.b, R.layout.hdr_video_bottom_sheet_content, null);
        }
        this.l = (moo) this.n.findViewById(R.id.hdr_bottom_sheet_normal_video);
        this.m = (moo) this.n.findViewById(R.id.hdr_bottom_sheet_hdr_video);
        if (this.d == null || this.e == null) {
            Context context = this.b;
            String string = context.getString(R.string.hdr_video_bottom_sheet_normal_video_acc);
            moo mooVar = this.l;
            rwc rwcVarJ = rwc.j(this.m);
            mwq mwqVar = this.o;
            Executor executor = this.c;
            ScheduledExecutorService scheduledExecutorService = this.k;
            this.d = new gky(mooVar, rwcVarJ, mwqVar, context, executor, i, string, scheduledExecutorService, new gku(this, 7));
            this.e = new gky(this.m, rwc.j(this.l), mwqVar, context, executor, j, context.getString(R.string.hdr_video_bottom_sheet_hdr_video_acc), scheduledExecutorService, new gku(this, 8));
        }
        this.d.g(this.e);
        this.e.g(this.d);
        this.d.b();
        this.e.b();
        this.l.f();
        this.m.g();
        this.a.n(13, R.string.hdr_video_bottom_sheet_title, this.n, this);
    }

    public final void b() {
        this.n.findViewById(R.id.hdr_bottom_sheet_hdr_caption).setVisibility(0);
        this.n.findViewById(R.id.hdr_bottom_sheet_normal_caption).setVisibility(0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.d.d();
        this.e.d();
    }
}
