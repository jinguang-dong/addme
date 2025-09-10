package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Range;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jnw implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ jnw(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, poj] */
    /* JADX WARN: Type inference failed for: r15v46, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r15v68, types: [java.lang.Object, kbq] */
    /* JADX WARN: Type inference failed for: r15v91, types: [java.lang.Object, poj] */
    /* JADX WARN: Type inference failed for: r15v94, types: [java.lang.Object, kbq] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r2v15, types: [imj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18, types: [sgt, shi] */
    @Override // java.lang.Runnable
    public final void run() throws Resources.NotFoundException, IOException {
        paq fhfVar;
        gga ggaVarE;
        kiq kiqVar;
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        int i = 6;
        byte[] bArr = null;
        int i2 = 0;
        switch (this.c) {
            case 0:
                ((jnx) this.a).f((Range) this.b);
                return;
            case 1:
                jnl jnlVar = (jnl) this.b;
                if (jnlVar.l.get()) {
                    return;
                }
                Object obj = this.a;
                ((sgt) jnm.a.b().M(2890)).v("Long Shot with uri %s timed out.", jnlVar.a);
                ((jnm) obj).s.a();
                return;
            case 2:
                ((jnx) this.a).f((Range) this.b);
                return;
            case 3:
                Object obj2 = this.a;
                jom jomVar = (jom) obj2;
                rwc rwcVar = jomVar.a;
                if (rwcVar.h()) {
                    ((hpg) rwcVar.c()).b();
                    jomVar.e.set(0L);
                }
                Object obj3 = this.b;
                syu syuVarA = obj3 != null ? ((jol) obj3).a.a() : ske.M(null);
                jsv.a("AudioTrackSampler", syuVarA);
                syuVarA.c(new jmr(obj2, i), sxo.a);
                return;
            case 4:
                try {
                    ske.U(this.b);
                    return;
                } catch (Throwable th) {
                    if (th instanceof CancellationException) {
                        return;
                    }
                    ((sgt) ((sgt) jov.a.c().i(th)).M(2988)).v("%s: muxer result failed", this.a);
                    return;
                }
            case 5:
                Object obj4 = this.a;
                Object obj5 = this.b;
                synchronized (obj5) {
                    if (obj4 == ((jtr) obj5).a) {
                        ((jtr) obj5).a = null;
                    }
                }
                return;
            case 6:
                Object obj6 = this.a;
                Object obj7 = this.b;
                synchronized (obj7) {
                    if (obj6 == ((jtu) obj7).a) {
                        ((jtu) obj7).a = null;
                    }
                }
                return;
            case 7:
                Object obj8 = this.a;
                Object obj9 = this.b;
                synchronized (obj9) {
                    if (obj8 == ((jty) obj9).c) {
                        ((jty) obj9).c = null;
                    }
                }
                return;
            case 8:
                Object obj10 = this.a;
                Object obj11 = this.b;
                ((jty) obj11).b.post(new jnw(obj11, obj10, 9, bArr));
                return;
            case 9:
                jms jmsVar = ((jty) this.b).a;
                if (jmsVar.k) {
                    return;
                }
                if (jmsVar.w.p(gzo.bs)) {
                    jmsVar.a.b().performHapticFeedback(0);
                }
                jmsVar.m = ((kfl) this.a).j;
                jmsVar.k = true;
                out outVar = jmsVar.g;
                nca ncaVar = jmsVar.u;
                ncaVar.getClass();
                outVar.c(new jmr(ncaVar, i2));
                ncaVar.a();
                jmsVar.r.d(false);
                jmsVar.c.w(false);
                mmk mmkVar = jmsVar.q;
                mmkVar.b(true);
                mmkVar.d(true);
                jmsVar.t.k();
                fvu fvuVar = jmsVar.f;
                fvuVar.a.w();
                fvuVar.e(fvv.CAPTURING_OR_RECORDING);
                mns mnsVar = jmsVar.x;
                if (((Boolean) mnsVar.b.dL()).booleanValue() && (ggaVarE = ((jmw) mnsVar.e).e()) != null && ((pkb) ggaVarE.b).J() && ((kiqVar = (kiq) ggaVarE.d.dL()) == kiq.HDR_PLUS_WITH_TORCH || kiqVar == kiq.NORMAL_WITH_FLASH)) {
                    ((imi) mnsVar.c).a(mnsVar.f);
                    fhfVar = new jkf(mnsVar, i);
                } else {
                    fhfVar = new fhf(15);
                }
                mnsVar.a.add(fhfVar);
                jmsVar.a.X();
                jmsVar.b.g();
                if (!((Boolean) ((ovx) jmsVar.h).d).booleanValue()) {
                    jmsVar.v.g(jms.class);
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jmsVar.j != null) {
                    jmsVar.j.cancel(false);
                }
                jmsVar.j = jmsVar.d.scheduleAtFixedRate(new hcv(jmsVar, jCurrentTimeMillis, 4), 1L, 1L, TimeUnit.SECONDS);
                if (jmsVar.n) {
                    jmsVar.a();
                    return;
                }
                return;
            case 10:
                ((jue) this.a).b.c((gnm) this.b);
                return;
            case 11:
                fwk fwkVar = ((jxp) this.a).p;
                fwkVar.getClass();
                fwkVar.c((gnm) this.b);
                return;
            case 12:
                Object obj12 = this.b;
                Object obj13 = this.a;
                try {
                    autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(rbu.b((Context) ((jxt) obj13).i.f, (Uri) obj12, "wt").getParcelFileDescriptor());
                } catch (IOException e) {
                    ((sgt) ((sgt) jxt.a.b().i(e)).M((char) 3142)).v("Failed to truncate contents of %s", obj12);
                }
                try {
                    autoCloseOutputStream.flush();
                    autoCloseOutputStream.close();
                    ((jxt) obj13).e = rvk.a;
                    return;
                } finally {
                }
            case 13:
                ((jxv) this.a).c.c((gnm) this.b);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                this.b.c(this.a);
                return;
            case 15:
                Object obj14 = this.a;
                Object obj15 = this.b;
                synchronized (obj15) {
                    Iterator it = ((kai) obj15).j.iterator();
                    while (it.hasNext()) {
                        kad kadVar = (kad) it.next();
                        if (kadVar.e() && kadVar.a().c.equals(obj14)) {
                            it.remove();
                            ((kai) obj15).n();
                            return;
                        }
                    }
                    ((kai) obj15).f();
                    ((sgt) kai.a.c().M(3184)).v("Failed shot %s was not present", obj14);
                    return;
                }
            case 16:
                kai kaiVar = ((kaa) this.b).b;
                Object obj16 = this.a;
                synchronized (kaiVar) {
                    kaiVar.e.b("Microvideo started at <" + (((Long) ((kae) obj16).d.h()).longValue() / 1000) + "> cancelled.");
                    kaiVar.d((kae) obj16);
                    kaiVar.n();
                }
                return;
            case 17:
                kai kaiVar2 = ((kac) this.b).b;
                Object obj17 = this.a;
                synchronized (kaiVar2) {
                    ((kag) obj17).a = false;
                    kaiVar2.n();
                }
                return;
            case 18:
                kai kaiVar3 = ((kac) this.b).b;
                Object obj18 = this.a;
                synchronized (kaiVar3) {
                    kaiVar3.j.remove(obj18);
                    kaiVar3.e(((kag) obj18).c);
                    kaiVar3.n();
                }
                return;
            case 19:
                kas kasVar = ((kar) this.b).a;
                ?? r15 = this.a;
                synchronized (kasVar) {
                    pbc pbcVar = kasVar.e;
                    pbcVar.b("DBG writing image " + r15.d());
                    if (!kasVar.g) {
                        kasVar.f.addLast(r15);
                        kasVar.c("ImageSink-write");
                        return;
                    }
                    pbcVar.h("Image sink closed but still received frame at " + r15.d());
                    r15.close();
                    return;
                }
            default:
                if (((AtomicBoolean) this.a).getAndSet(true)) {
                    return;
                }
                this.b.b(new TimeoutException("HDR+ timed out after 10000 ms"));
                return;
        }
    }

    public /* synthetic */ jnw(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
