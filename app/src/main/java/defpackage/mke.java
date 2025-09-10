package defpackage;

import android.R;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
class mke {
    public static final sgv a = sgv.g("mke");
    public final Context c;
    public final Executor d;
    public final our e;
    public final out f;
    public final naw g;
    public final mgm h;
    public final mhq i;
    public final mkr j;
    protected final BroadcastReceiver k;
    public dv m;
    sbp n;
    public final iyu o;
    public final mgp p;
    public oge q;
    public final ocq r;
    public final AtomicBoolean b = new AtomicBoolean(false);
    protected final Object l = new Object();

    public mke(Context context, iyu iyuVar, Executor executor, our ourVar, out outVar, naw nawVar, mgm mgmVar, ocq ocqVar, mgp mgpVar, mhq mhqVar, mkr mkrVar) {
        int i = sbp.d;
        this.n = sex.a;
        this.c = context;
        this.o = iyuVar;
        this.d = executor;
        this.f = outVar;
        this.g = nawVar;
        this.h = mgmVar;
        this.r = ocqVar;
        this.p = mgpVar;
        this.i = mhqVar;
        this.e = ourVar;
        this.j = mkrVar;
        this.k = new mkd(this, mkrVar);
    }

    final void a(mgn mgnVar, final boolean z) {
        if (mgnVar.b()) {
            return;
        }
        this.f.c(new Runnable() { // from class: mjz
            @Override // java.lang.Runnable
            public final void run() {
                final mke mkeVar = this.a;
                if (z) {
                    mkeVar.m = mkeVar.r.ad(new DialogInterface.OnClickListener() { // from class: mkc
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            mkeVar.o.K.d();
                            dialogInterface.dismiss();
                        }
                    });
                } else {
                    mkeVar.m = mkeVar.r.ae(new DialogInterface.OnClickListener() { // from class: mjt
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            mkeVar.o.K.d();
                            dialogInterface.dismiss();
                        }
                    });
                }
                mkeVar.m.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: mju
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        mkeVar.m = null;
                    }
                });
                if (mkeVar.m.isShowing()) {
                    return;
                }
                mkeVar.m.show();
                TextView textView = (TextView) mkeVar.m.findViewById(R.id.message);
                textView.getClass();
                textView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        });
        ((mjl) this.q.a).k(4);
    }
}
