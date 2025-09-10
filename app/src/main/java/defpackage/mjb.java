package defpackage;

import android.content.Context;
import com.google.ar.core.R;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mjb implements owy {
    final /* synthetic */ int a;
    final /* synthetic */ mje b;

    public mjb(mje mjeVar, int i) {
        this.a = i;
        this.b = mjeVar;
    }

    @Override // defpackage.owy
    public final void a(Exception exc) {
        ((sgt) ((sgt) mje.a.b().i(exc)).M(4832)).v("Camcorder.onError(): %s", exc);
        mje mjeVar = this.b;
        mjeVar.D.clear();
        mjj mjjVar = mjeVar.ac;
        mjjVar.getClass();
        ((sgt) mjl.a.b().M(4851)).v("onRecordingError() %s", exc);
        mjl mjlVar = mjjVar.e;
        mjlVar.l.a(mii.STATE_RECORDING_ERROR);
        nao naoVar = new nao();
        Context context = mjjVar.d;
        naoVar.h = context;
        naoVar.j = 12;
        naoVar.a = false;
        naoVar.e = context.getString(R.string.vid_chip_err);
        mjjVar.f.a(naoVar.a());
        mjlVar.j(3);
    }

    @Override // defpackage.owy
    public final void b() {
        mje mjeVar = this.b;
        oxd oxdVar = mjeVar.Z;
        oxdVar.getClass();
        oxdVar.a.o(hqp.TIMELAPSE.e());
        mjeVar.E.schedule(new mir(this, 10), this.a, TimeUnit.MILLISECONDS);
        mkt mktVar = mjeVar.L;
        mktVar.getClass();
        mktVar.b();
    }

    @Override // defpackage.owy
    public final void c() {
        this.b.g();
    }
}
