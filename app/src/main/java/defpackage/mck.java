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
public final class mck implements DialogInterface.OnDismissListener, DialogInterface.OnCancelListener, View.OnScrollChangeListener, mnh {
    public final mni a;
    public final Context b;
    public mct c;
    public mct d;
    public final hbj f;
    private final Executor g;
    private final ScheduledExecutorService h;
    private final luj j;
    private final mwq k;
    public boolean e = false;
    private int i = 1;

    public mck(mni mniVar, Context context, mwq mwqVar, Executor executor, ScheduledExecutorService scheduledExecutorService, luj lujVar, hbj hbjVar) {
        this.a = mniVar;
        this.b = context;
        this.k = mwqVar;
        this.g = executor;
        this.h = scheduledExecutorService;
        this.j = lujVar;
        this.f = hbjVar;
    }

    @Override // defpackage.mnh
    public final void a(int i) {
        if (i != this.i) {
            this.e = false;
            this.i = i;
        }
    }

    public final void b() {
        out.a();
        this.j.d(luf.Z, true);
        mni mniVar = this.a;
        mniVar.e = this;
        mniVar.d = this;
        Context context = this.b;
        View viewInflate = View.inflate(context, R.layout.speech_btmsheet_content, null);
        moj mojVar = (moj) viewInflate.findViewById(R.id.speech_btmsheet_normal_container);
        Executor executor = this.g;
        ScheduledExecutorService scheduledExecutorService = this.h;
        mwq mwqVar = this.k;
        mct mctVar = new mct(mojVar, Uri.parse("https://www.gstatic.com/aiux/gca/cocktailparty/test_sample10_off.mp4"), context.getString(R.string.speech_btmsheet_normal_acc), context, mwqVar, this, executor, scheduledExecutorService);
        this.c = mctVar;
        mctVar.h();
        mct mctVar2 = new mct((moj) viewInflate.findViewById(R.id.speech_btmsheet_enhanced_container), Uri.parse("https://www.gstatic.com/aiux/gca/cocktailparty/test_sample10_on.mp4"), context.getString(R.string.speech_btmsheet_enhanced_acc), context, mwqVar, this, executor, scheduledExecutorService);
        this.d = mctVar2;
        mctVar2.h();
        mniVar.q(10, R.string.speech_btmsheet_title, viewInflate, this, null, rwc.j(this));
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        mct mctVar = this.c;
        if (mctVar != null) {
            mctVar.f();
        }
        mct mctVar2 = this.d;
        if (mctVar2 != null) {
            mctVar2.f();
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        mni mniVar = this.a;
        mniVar.e = null;
        mniVar.d = null;
    }

    @Override // android.view.View.OnScrollChangeListener
    public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
        if (this.i != 2 || this.e) {
            return;
        }
        view.postDelayed(new lsn(this, view, 14, null), 250L);
    }
}
