package defpackage;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.graphics.SurfaceTexture;
import android.hardware.SensorEventListener;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.vision.opengl.Texture;
import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class hty implements paq {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public hty(hbp hbpVar, klc klcVar, int i) {
        this.c = i;
        this.a = klcVar;
        this.b = hbpVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [hyg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [imj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, pdm] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, job] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v18, types: [android.hardware.SensorEventListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object, mng] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.lang.Object, mng] */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Object, pdn] */
    /* JADX WARN: Type inference failed for: r7v27, types: [java.lang.Object, paq] */
    /* JADX WARN: Type inference failed for: r7v49, types: [android.view.View$OnLayoutChangeListener, java.lang.Object] */
    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        ito itoVar;
        switch (this.c) {
            case 0:
                ((huc) this.a).u.s.D.remove(this.b);
                return;
            case 1:
                ((huc) this.a).u.l(this.b);
                return;
            case 2:
                Object obj = this.b;
                Object obj2 = ((hyf) obj).a;
                Object obj3 = this.a;
                synchronized (obj2) {
                    ((hyf) obj).b.remove(obj3);
                }
                return;
            case 3:
                ((hyh) this.b).g(this.a);
                return;
            case 4:
                out.a();
                ((ViewGroup) ((obu) this.b).a).removeView((View) ((jdh) this.a).b);
                return;
            case 5:
                ((SurfaceTexture) this.a).release();
                iki ikiVar = (iki) this.b;
                ikiVar.e = null;
                Texture texture = ikiVar.d;
                rnt.x(texture);
                texture.delete();
                ikiVar.f.a();
                return;
            case 6:
                ((imi) this.a).f(this.b);
                return;
            case 7:
                ((imi) this.a).h((imk) this.b);
                return;
            case 8:
                ((ipn) this.b).b.unregisterListener((SensorEventListener) this.a);
                return;
            case 9:
                ((ips) this.a).b.i(this.b);
                return;
            case 10:
                ((iqv) this.a).b.i(this.b);
                return;
            case 11:
                Object obj4 = this.b;
                if (obj4 == null || (itoVar = ((iry) this.a).g) == null) {
                    return;
                }
                ((itl) obj4).h(itoVar);
                return;
            case 12:
                this.b.m(this.a);
                return;
            case 13:
                ((jml) this.a).i(this.b);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                int i = jmv.d;
                ((pfz) this.b).close();
                this.a.close();
                return;
            case 15:
                jmw jmwVar = (jmw) this.b.a();
                Object obj5 = jmwVar.d;
                Object obj6 = this.a;
                synchronized (obj5) {
                    if (!jmwVar.b.remove(obj6)) {
                        ((sgt) jmw.a.c().M(2851)).s("Detaching perOneCamera resources that were not attached");
                    }
                }
                return;
            case 16:
                Object obj7 = this.b;
                Object obj8 = this.a;
                synchronized (obj8) {
                    ((kai) obj8).e.b(eld.b(obj7, "removing fallback shot: "));
                    ((kai) obj8).l.remove(obj7);
                }
                return;
            case 17:
                Object obj9 = this.b;
                Object obj10 = ((hbp) obj9).b;
                Object obj11 = this.a;
                synchronized (obj10) {
                    Iterator it = ((klc) obj11).d.iterator();
                    while (it.hasNext()) {
                        ((hbp) obj9).a.remove((Long) it.next());
                    }
                    ske.W(ske.J(ejt.n(DesugarCollections.unmodifiableMap(((klc) obj11).c).values()), ejt.n(DesugarCollections.unmodifiableList(((klc) obj11).g))), new iiz(((hbp) obj9).c, obj11, 8, null), sxo.a);
                }
                return;
            case 18:
                ((kyy) this.a).d((AtomicReference) this.b);
                return;
            case 19:
                ((Activity) this.a).unregisterReceiver((BroadcastReceiver) this.b);
                return;
            default:
                View view = ((lle) this.b).o;
                view.getClass();
                view.removeOnLayoutChangeListener(this.a);
                return;
        }
    }

    public /* synthetic */ hty(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ hty(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
