package defpackage;

import android.content.Context;
import com.google.ar.core.R;
import java.util.Iterator;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class mir implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mir(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.Object, pbp] */
    /* JADX WARN: Type inference failed for: r9v37, types: [java.lang.Object, mjn] */
    /* JADX WARN: Type inference failed for: r9v48, types: [java.lang.Object, mjn] */
    /* JADX WARN: Type inference failed for: r9v54, types: [java.lang.Object, mjn] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((mis) this.a).b().a().i();
                return;
            case 1:
                fqf fqfVar = (fqf) this.a;
                if (fqfVar.u) {
                    fqfVar.eB();
                    return;
                }
                return;
            case 2:
                ((miv) this.a).b.set(true);
                return;
            case 3:
                ((miv) this.a).t = null;
                return;
            case 4:
                mjj mjjVar = ((mje) this.a).ac;
                mjjVar.getClass();
                mjjVar.e.l.a(mii.STATE_RECORDING_PAUSE);
                return;
            case 5:
                this.a.a();
                return;
            case 6:
                mje mjeVar = (mje) this.a;
                Iterator it = mjeVar.h.iterator();
                while (it.hasNext()) {
                    mjeVar.w.l(((lte) it.next()).b, null);
                }
                return;
            case 7:
                ((mje) this.a).g();
                return;
            case 8:
                Object obj = this.a;
                mje mjeVar2 = (mje) obj;
                if (((mlb) mjeVar2.D.get(0)).k) {
                    mjeVar2.g.execute(new mir(obj, 7));
                } else {
                    mjeVar2.Z.b();
                }
                mik mikVar = mjeVar2.x;
                mikVar.a.set(false);
                int i = mikVar.p;
                if (i == 0) {
                    throw null;
                }
                if (i == 3) {
                    mikVar.p = 1;
                    mikVar.s.q(true, false, false);
                }
                mikVar.g.g(false);
                return;
            case 9:
                mje mjeVar3 = (mje) this.a;
                mjj mjjVar2 = mjeVar3.ac;
                mjjVar2.getClass();
                mjjVar2.a();
                mjeVar3.z.j();
                oxj oxjVar = mjeVar3.H;
                int i2 = true != oxjVar.e() ? R.plurals.nightlapse_recording_1080p_chip : R.plurals.nightlapse_recording_4k_chip;
                double d = true != oxjVar.e() ? 1.0d : 0.25d;
                ree reeVar = mjeVar3.af;
                int i3 = ((mky) reeVar.f).e * 10;
                nao naoVar = new nao();
                naoVar.j = 10;
                naoVar.a = false;
                Context context = (Context) reeVar.a;
                naoVar.h = context;
                int i4 = (int) ((i3 / d) / 60.0d);
                naoVar.e = context.getResources().getQuantityString(i2, i4, 10, Integer.valueOf(i4));
                ((imi) reeVar.d).a(naoVar.a());
                return;
            case 10:
                mje mjeVar4 = ((mjb) this.a).b;
                mjj mjjVar3 = mjeVar4.ac;
                mjjVar3.getClass();
                mjjVar3.a();
                mjeVar4.z.j();
                return;
            case 11:
                ((mjl) this.a).d();
                return;
            case 12:
                this.a.e();
                return;
            case 13:
                mjl mjlVar = (mjl) this.a;
                mjlVar.x.unregisterListener(mjlVar.w, mjlVar.F);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                mjl mjlVar2 = (mjl) this.a;
                mjlVar2.B.b();
                mjlVar2.A.j();
                mjlVar2.l.a(mii.STATE_UNINITIALIZED);
                mjlVar2.b(mjlVar2.f.get(), mjlVar2.g.get());
                return;
            case 15:
                ((mkl) this.a).b();
                return;
            case 16:
                mjl mjlVar3 = (mjl) this.a;
                mjlVar3.x.registerListener(mjlVar3.w, mjlVar3.F, 3);
                return;
            case 17:
                this.a.c();
                return;
            case 18:
                ((mkl) this.a).a();
                return;
            case 19:
                mjl mjlVar4 = (mjl) this.a;
                mjlVar4.z.d(true);
                mjlVar4.e.set(true);
                return;
            default:
                this.a.f();
                return;
        }
    }
}
