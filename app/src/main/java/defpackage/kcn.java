package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.ar.core.R;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kcn implements DialogInterface.OnDismissListener {
    public final mni a;
    public final Context b;
    public gky d;
    public final hbj f;
    private final Executor g;
    private final ScheduledExecutorService h;
    private final mky i;
    private View j;
    private moo k;
    private final mwq l;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public FrameLayout e = null;

    public kcn(Context context, mni mniVar, mwq mwqVar, Executor executor, ScheduledExecutorService scheduledExecutorService, mky mkyVar, hbj hbjVar) {
        this.a = mniVar;
        this.b = context;
        this.l = mwqVar;
        this.g = executor;
        this.h = scheduledExecutorService;
        this.i = mkyVar;
        this.f = hbjVar;
    }

    public final void a() {
        mni mniVar = this.a;
        if (mniVar.k() && this.c.get()) {
            return;
        }
        if (this.j == null) {
            View viewInflate = View.inflate(this.b, R.layout.nightlapse_edu_layout, null);
            this.j = viewInflate;
            moo mooVar = (moo) viewInflate.findViewById(R.id.nightlapse_videoview);
            this.k = mooVar;
            mooVar.e();
        }
        TextView textView = (TextView) this.j.findViewById(R.id.nightlapse_edu_record_duration_info);
        int i = this.i.e * 10;
        Context context = this.b;
        double d = i;
        textView.setText(context.getResources().getString(R.string.nightlapse_edu_video_length, Integer.valueOf((int) (d / 60.0d)), 10, Integer.valueOf((int) ((d / 0.25d) / 60.0d)), 10));
        if (this.d == null) {
            gky gkyVar = new gky(this.k, rvk.a, this.l, context, this.g, Uri.parse(context.getString(R.string.nightlapse_edu_video_url)), context.getString(R.string.nightlapse_edu_video_acc), this.h, new jxr(this, 17));
            this.d = gkyVar;
            gkyVar.b();
        }
        this.c.set(true);
        mniVar.n(28, R.string.nightlapse_edu_title, this.j, this);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        gky gkyVar = this.d;
        if (gkyVar != null) {
            gkyVar.d();
        }
    }
}
