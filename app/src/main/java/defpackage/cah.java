package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cah extends uht implements uiu {
    int a;
    final /* synthetic */ uka b;
    final /* synthetic */ bao c;
    final /* synthetic */ cwh d;
    final /* synthetic */ cai e;
    final /* synthetic */ View f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cah(uka ukaVar, bao baoVar, cwh cwhVar, cai caiVar, View view, uhb uhbVar) {
        super(2, uhbVar);
        this.b = ukaVar;
        this.c = baoVar;
        this.d = cwhVar;
        this.e = caiVar;
        this.f = view;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cah) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2, types: [uol] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    @Override // defpackage.uhn
    public final Object b(Object obj) throws Throwable {
        uol uolVarC;
        uol uolVar;
        utj utjVar;
        uhi uhiVar = uhi.a;
        ?? r1 = this.a;
        try {
            if (r1 != 0) {
                uolVar = (uol) this.g;
                rnt.aN(obj);
            } else {
                rnt.aN(obj);
                und undVar = (und) this.g;
                r1 = 0;
                r1 = 0;
                bzt bztVar = (bzt) this.b.a;
                if (bztVar != null) {
                    Context applicationContext = this.f.getContext().getApplicationContext();
                    Map map = cal.a;
                    synchronized (map) {
                        Object obj2 = map.get(applicationContext);
                        Object obj3 = obj2;
                        if (obj2 == null) {
                            ContentResolver contentResolver = applicationContext.getContentResolver();
                            Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                            uqm uqmVarP = ukc.P(-1, 0, null, 6);
                            urd urdVar = new urd(new caj(contentResolver, uriFor, new cak(uqmVarP, Handler.createAsync(Looper.getMainLooper())), uqmVarP, applicationContext, null));
                            upi upiVar = new upi();
                            una unaVar = unr.a;
                            utj utjVarA = ung.A(urdVar, new uvc(ske.aI(upiVar, uvw.a)), new uti(), Float.valueOf(Settings.Global.getFloat(applicationContext.getContentResolver(), "animator_duration_scale", 1.0f)));
                            map.put(applicationContext, utjVarA);
                            obj3 = utjVarA;
                        }
                        utjVar = (utj) obj3;
                    }
                    bztVar.b(((Number) utjVar.c()).floatValue());
                    uolVarC = ukc.C(undVar, null, 0, new ve(utjVar, bztVar, (uhb) null, 4), 3);
                } else {
                    uolVarC = null;
                }
                try {
                    bao baoVar = this.c;
                    this.g = uolVarC;
                    this.a = 1;
                    Object objS = ung.s(baoVar.b, new bal(baoVar, new ban(baoVar, null), bay.m(q()), null), this);
                    uhi uhiVar2 = uhi.a;
                    Object obj4 = objS;
                    if (objS != uhiVar2) {
                        obj4 = ufg.a;
                    }
                    if (obj4 != uhiVar2) {
                        obj4 = ufg.a;
                    }
                    if (obj4 == uhiVar) {
                        return uhiVar;
                    }
                    uolVar = uolVarC;
                } catch (Throwable th) {
                    th = th;
                    r1 = uolVarC;
                    Throwable th2 = th;
                    if (r1 != 0) {
                        r1.s(null);
                    }
                    this.d.getLifecycle().c(this.e);
                    throw th2;
                }
            }
            if (uolVar != null) {
                uolVar.s(null);
            }
            this.d.getLifecycle().c(this.e);
            return ufg.a;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        cah cahVar = new cah(this.b, this.c, this.d, this.e, this.f, uhbVar);
        cahVar.g = obj;
        return cahVar;
    }
}
