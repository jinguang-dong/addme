package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.camera.jni.gxp.Caan.yoGAhrpjU;
import com.google.android.apps.camera.util.ui.GcaTextView;
import com.google.ar.core.R;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gmy implements DialogInterface.OnDismissListener, DialogInterface.OnCancelListener {
    public static final Uri a = Uri.parse(yoGAhrpjU.yArqyJ);
    public final mni b;
    public final Context c;
    public final Executor d;
    public final ScheduledExecutorService e;
    public View f;
    public View g;
    public GcaTextView h;
    public View i;
    public GcaTextView j;
    public ViewGroup k;
    public ViewGroup l;
    public int n;
    public int o;
    public gky p;
    public final mwq q;
    public boolean m = true;
    private boolean r = true;

    public gmy(mni mniVar, Context context, mwq mwqVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.b = mniVar;
        this.c = context;
        this.q = mwqVar;
        this.d = executor;
        this.e = scheduledExecutorService;
    }

    public final void a(View view, GcaTextView gcaTextView, View view2, GcaTextView gcaTextView2) {
        Context context = this.c;
        view.setBackground(context.getDrawable(R.drawable.nsv_edu_option_unselected));
        gcaTextView.setTextColor(this.o);
        view2.setBackground(context.getDrawable(R.drawable.nsv_edu_option_selected));
        gcaTextView2.setTextColor(this.n);
    }

    public final boolean b() {
        return !this.m;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.r = true;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (b() && this.r) {
            a(this.i, this.j, this.g, this.h);
            jea.r(this.l, this.k);
            this.m = true;
        }
        this.r = false;
    }
}
