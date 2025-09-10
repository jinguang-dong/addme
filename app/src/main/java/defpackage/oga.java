package defpackage;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.oQFY.clFzVRcygwbq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oga implements oeu, oev {
    public final oeo b;
    public final ofl c;
    public final int f;
    public boolean g;
    public final /* synthetic */ ogd k;
    public final mwq l;
    private final ogu m;
    public final Queue a = new LinkedList();
    public final Set d = new HashSet();
    public final Map e = new HashMap();
    public final List h = new ArrayList();
    public odj i = null;
    public int j = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public oga(ogd ogdVar, oet oetVar) {
        this.k = ogdVar;
        Looper looper = ogdVar.n.getLooper();
        ohp ohpVarA = oetVar.d().a();
        oeo oeoVarEO = ((ojl) oetVar.k.a).eO(oetVar.b, looper, ohpVarA, oetVar.d, this, this);
        pfl pflVar = oetVar.j;
        if (pflVar != null) {
            ((ohm) oeoVarEO).p = pflVar;
        } else {
            String str = oetVar.c;
            if (str != null) {
                ((ohm) oeoVarEO).j = str;
            }
        }
        this.b = oeoVarEO;
        this.c = oetVar.e;
        this.l = new mwq((short[]) null);
        this.f = oetVar.g;
        if (oeoVarEO.n()) {
            this.m = new ogu(ogdVar.g, ogdVar.n, oetVar.d().a());
        } else {
            this.m = null;
        }
    }

    private final odl q(odl[] odlVarArr) {
        if (odlVarArr != null) {
            odl[] odlVarArrO = this.b.o();
            if (odlVarArrO == null) {
                odlVarArrO = new odl[0];
            }
            yd ydVar = new yd(odlVarArrO.length);
            for (odl odlVar : odlVarArrO) {
                ydVar.put(odlVar.a, Long.valueOf(odlVar.a()));
            }
            for (int i = 0; i <= 0; i++) {
                odl odlVar2 = odlVarArr[i];
                Long l = (Long) ydVar.get(odlVar2.a);
                if (l == null || l.longValue() < odlVar2.a()) {
                    return odlVar2;
                }
            }
        }
        return null;
    }

    private final Status r(odj odjVar) {
        return ogd.a(this.c, odjVar);
    }

    private final void s(odj odjVar) {
        Set set = this.d;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((ofm) it.next()).a(this.c, odjVar, a.K(odjVar, odj.a) ? this.b.f() : null);
        }
        set.clear();
    }

    private final void t(Status status, Exception exc, boolean z) {
        ojl.as(this.k.n);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ofk ofkVar = (ofk) it.next();
            if (!z || ofkVar.c == 2) {
                if (status != null) {
                    ofkVar.d(status);
                } else {
                    ofkVar.e(exc);
                }
                it.remove();
            }
        }
    }

    private final void u(ofk ofkVar) {
        ofkVar.g(this.l, p());
        try {
            ofkVar.f(this);
        } catch (DeadObjectException unused) {
            a(1);
            this.b.j("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final boolean v(ofk ofkVar) {
        if (!(ofkVar instanceof ofe)) {
            u(ofkVar);
            return true;
        }
        ofe ofeVar = (ofe) ofkVar;
        odl odlVarQ = q(ofeVar.b(this));
        if (odlVarQ == null) {
            u(ofkVar);
            return true;
        }
        Log.w("GoogleApiManager", this.b.getClass().getName() + " could not execute call because it requires feature (" + odlVarQ.a + ", " + odlVarQ.a() + ").");
        ogd ogdVar = this.k;
        if (!ogdVar.o || !ofeVar.a(this)) {
            ofeVar.e(new ofd(odlVarQ));
            return true;
        }
        ogb ogbVar = new ogb(this.c, odlVarQ);
        List list = this.h;
        int iIndexOf = list.indexOf(ogbVar);
        if (iIndexOf >= 0) {
            ogb ogbVar2 = (ogb) list.get(iIndexOf);
            Handler handler = ogdVar.n;
            handler.removeMessages(15, ogbVar2);
            handler.sendMessageDelayed(Message.obtain(handler, 15, ogbVar2), 5000L);
            return false;
        }
        list.add(ogbVar);
        Handler handler2 = ogdVar.n;
        handler2.sendMessageDelayed(Message.obtain(handler2, 15, ogbVar), 5000L);
        handler2.sendMessageDelayed(Message.obtain(handler2, 16, ogbVar), 120000L);
        odj odjVar = new odj(2, null);
        if (w(odjVar)) {
            return false;
        }
        ogdVar.h(odjVar, this.f);
        return false;
    }

    private final boolean w(odj odjVar) {
        synchronized (ogd.c) {
            ogd ogdVar = this.k;
            if (ogdVar.l == null || !ogdVar.m.contains(this.c)) {
                return false;
            }
            ofx ofxVar = ogdVar.l;
            qev qevVar = new qev(odjVar, this.f);
            if (a.x(ofxVar.b, qevVar)) {
                ofxVar.c.post(new kha(ofxVar, qevVar, 2));
            }
            return true;
        }
    }

    @Override // defpackage.ofu
    public final void a(int i) {
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = this.k.n;
        if (looperMyLooper == handler.getLooper()) {
            k(i);
        } else {
            handler.post(new mzp(this, i, 5));
        }
    }

    @Override // defpackage.ofu
    public final void b() {
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = this.k.n;
        if (looperMyLooper == handler.getLooper()) {
            h();
        } else {
            handler.post(new ntd(this, 19, null));
        }
    }

    public final void c() {
        ojl.as(this.k.n);
        this.i = null;
    }

    public final void d() {
        ogd ogdVar = this.k;
        ojl.as(ogdVar.n);
        oeo oeoVar = this.b;
        if (oeoVar.k() || oeoVar.l()) {
            return;
        }
        try {
            pit pitVar = ogdVar.p;
            Context context = ogdVar.g;
            ojl.ay(context);
            ojl.ay(oeoVar);
            int iF = 0;
            if (oeoVar.m()) {
                int iA = oeoVar.a();
                int i = pitVar.i(iA);
                if (i == -1) {
                    Object obj = pitVar.a;
                    synchronized (obj) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= ((SparseIntArray) obj).size()) {
                                iF = -1;
                                break;
                            }
                            int iKeyAt = ((SparseIntArray) obj).keyAt(i2);
                            if (iKeyAt > iA && ((SparseIntArray) obj).get(iKeyAt) == 0) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                        if (iF == -1) {
                            iF = ((odo) pitVar.b).f(context, iA);
                        }
                        ((SparseIntArray) obj).put(iA, iF);
                    }
                } else {
                    iF = i;
                }
            }
            if (iF != 0) {
                odj odjVar = new odj(iF, null);
                Log.w("GoogleApiManager", "The service for " + this.b.getClass().getName() + " is not available: " + odjVar.toString());
                i(odjVar);
                return;
            }
            ogd ogdVar2 = this.k;
            oeo oeoVar2 = this.b;
            ogc ogcVar = new ogc(ogdVar2, oeoVar2, this.c);
            if (oeoVar2.n()) {
                ogu oguVar = this.m;
                ojl.ay(oguVar);
                onz onzVar = oguVar.e;
                if (onzVar != null) {
                    onzVar.w();
                }
                ohp ohpVar = oguVar.d;
                ohpVar.g = Integer.valueOf(System.identityHashCode(oguVar));
                ojl ojlVar = oguVar.g;
                Context context2 = oguVar.a;
                Handler handler = oguVar.b;
                oguVar.e = (onz) ojlVar.eO(context2, handler.getLooper(), ohpVar, ohpVar.f, oguVar, oguVar);
                oguVar.f = ogcVar;
                Set set = oguVar.c;
                if (set == null || set.isEmpty()) {
                    handler.post(new ooc(oguVar, 1, null));
                } else {
                    onz onzVar2 = oguVar.e;
                    onzVar2.i(new ohj(onzVar2));
                }
            }
            try {
                oeoVar2.i(ogcVar);
            } catch (SecurityException e) {
                j(new odj(10), e);
            }
        } catch (IllegalStateException e2) {
            j(new odj(10), e2);
        }
    }

    public final void e(ofk ofkVar) {
        ojl.as(this.k.n);
        if (this.b.k()) {
            if (v(ofkVar)) {
                m();
                return;
            } else {
                this.a.add(ofkVar);
                return;
            }
        }
        this.a.add(ofkVar);
        odj odjVar = this.i;
        if (odjVar == null || !odjVar.b()) {
            d();
        } else {
            i(odjVar);
        }
    }

    public final void f(Status status) {
        ojl.as(this.k.n);
        t(status, null, false);
    }

    public final void g() {
        Queue queue = this.a;
        ArrayList arrayList = new ArrayList(queue);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ofk ofkVar = (ofk) arrayList.get(i);
            if (!this.b.k()) {
                return;
            }
            if (v(ofkVar)) {
                queue.remove(ofkVar);
            }
        }
    }

    public final void h() {
        c();
        s(odj.a);
        o();
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            Object obj = ((gox) it.next()).b;
            if (q(((ogr) obj).b) != null) {
                it.remove();
            } else {
                try {
                    ((ogr) obj).b(this.b, new pfl((byte[]) null, (byte[]) null));
                } catch (DeadObjectException unused) {
                    a(3);
                    this.b.j("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException | RuntimeException e) {
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                }
            }
        }
        g();
        m();
    }

    @Override // defpackage.ogq
    public final void i(odj odjVar) {
        j(odjVar, null);
    }

    public final void j(odj odjVar, Exception exc) {
        onz onzVar;
        ogd ogdVar = this.k;
        Handler handler = ogdVar.n;
        ojl.as(handler);
        ogu oguVar = this.m;
        if (oguVar != null && (onzVar = oguVar.e) != null) {
            onzVar.w();
        }
        c();
        ogdVar.p.h();
        s(odjVar);
        if ((this.b instanceof oje) && odjVar.c != 24) {
            ogdVar.f = true;
            handler.sendMessageDelayed(handler.obtainMessage(19), 300000L);
        }
        int i = odjVar.c;
        if (i == 4) {
            f(ogd.b);
            return;
        }
        if (i == 25) {
            f(r(odjVar));
            return;
        }
        Queue queue = this.a;
        if (queue.isEmpty()) {
            this.i = odjVar;
            return;
        }
        if (exc != null) {
            ojl.as(handler);
            t(null, exc, false);
            return;
        }
        if (!ogdVar.o) {
            f(r(odjVar));
            return;
        }
        t(r(odjVar), null, true);
        if (queue.isEmpty() || w(odjVar) || ogdVar.h(odjVar, this.f)) {
            return;
        }
        if (i == 18) {
            this.g = true;
        }
        if (this.g) {
            handler.sendMessageDelayed(Message.obtain(handler, 9, this.c), 5000L);
        } else {
            f(r(odjVar));
        }
    }

    public final void l(odj odjVar) {
        ojl.as(this.k.n);
        oeo oeoVar = this.b;
        oeoVar.j("onSignInFailed for " + oeoVar.getClass().getName() + " with " + String.valueOf(odjVar));
        i(odjVar);
    }

    public final void m() {
        ogd ogdVar = this.k;
        Handler handler = ogdVar.n;
        ofl oflVar = this.c;
        handler.removeMessages(12, oflVar);
        handler.sendMessageDelayed(handler.obtainMessage(12, oflVar), ogdVar.e);
    }

    public final void n() {
        ojl.as(this.k.n);
        Status status = ogd.a;
        f(status);
        this.l.P(false, status);
        for (ogl oglVar : (ogl[]) this.e.keySet().toArray(new ogl[0])) {
            e(new ofj(oglVar, new pfl((byte[]) null, (byte[]) null)));
        }
        s(new odj(4));
        oeo oeoVar = this.b;
        if (oeoVar.k()) {
            oeoVar.q(new AmbientModeSupport.AmbientController(this));
        }
    }

    public final void o() {
        if (this.g) {
            ogd ogdVar = this.k;
            ofl oflVar = this.c;
            Handler handler = ogdVar.n;
            handler.removeMessages(11, oflVar);
            handler.removeMessages(9, oflVar);
            this.g = false;
        }
    }

    public final boolean p() {
        return this.b.n();
    }

    public final void k(int i) {
        c();
        this.g = true;
        String strG = this.b.g();
        StringBuilder sb = new StringBuilder(clFzVRcygwbq.yAy);
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (strG != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(strG);
        }
        this.l.P(true, new Status(20, sb.toString()));
        ogd ogdVar = this.k;
        ofl oflVar = this.c;
        Handler handler = ogdVar.n;
        handler.sendMessageDelayed(Message.obtain(handler, 9, oflVar), 5000L);
        handler.sendMessageDelayed(Message.obtain(handler, 11, oflVar), 120000L);
        ogdVar.p.h();
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            Object obj = ((gox) it.next()).a;
        }
    }
}
