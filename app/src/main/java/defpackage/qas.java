package defpackage;

import android.accounts.AccountManager;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Looper;
import com.google.android.gms.googlehelp.GoogleHelp;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qas {
    public final Object a;
    public final Object b;

    public qas(Activity activity) {
        this.b = activity;
        this.a = new nxi(activity, 2);
    }

    public static pxn e(pxn pxnVar, Uri uri, rwc rwcVar) {
        HashMap map = new HashMap(DesugarCollections.unmodifiableMap(pxnVar.b));
        map.remove(uri.toString());
        if (rwcVar.h()) {
            String string = uri.toString();
            Object objC = rwcVar.c();
            tpc tpcVarM = pxo.a.m();
            nzj nzjVar = (nzj) objC;
            String str = nzjVar.a;
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            pxo pxoVar = (pxo) tpcVarM.b;
            pxoVar.b |= 1;
            pxoVar.c = str;
            trn trnVarC = tsi.c(nzjVar.b, 0);
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            pxo pxoVar2 = (pxo) tpcVarM.b;
            trnVarC.getClass();
            pxoVar2.d = trnVarC;
            pxoVar2.b |= 2;
            map.put(string, (pxo) tpcVarM.l());
        }
        tpc tpcVar = (tpc) pxnVar.a(5, null);
        tpcVar.r(pxnVar);
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        ((pxn) tpcVar.b).b().clear();
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        ((pxn) tpcVar.b).b().putAll(map);
        return (pxn) tpcVar.l();
    }

    public static rwc f(pxn pxnVar, Uri uri) {
        String string = uri.toString();
        if (!DesugarCollections.unmodifiableMap(pxnVar.b).containsKey(string)) {
            return rvk.a;
        }
        pxo pxoVar = (pxo) DesugarCollections.unmodifiableMap(pxnVar.b).get(string);
        String str = pxoVar.c;
        trn trnVar = pxoVar.d;
        if (trnVar == null) {
            trnVar = trn.a;
        }
        tsi.d(trnVar);
        return rwc.j(new nzj(str, trnVar.b));
    }

    public final String a() {
        return (String) ((pmv) this.b).a;
    }

    public final pmq[] b() {
        return (pmq[]) ((pmv) this.b).b;
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, rww] */
    public final void c(Intent intent) throws PackageManager.NameNotFoundException {
        if (!intent.getAction().equals("com.google.android.gms.googlehelp.HELP") || !intent.hasExtra("EXTRA_GOOGLE_HELP")) {
            throw new IllegalArgumentException("The intent you are trying to launch is not GoogleHelp intent! This class only supports GoogleHelp intents.");
        }
        Object obj = this.b;
        Context context = (Context) obj;
        int iA = oef.a(context, 11925000);
        int i = 0;
        if (iA == 0) {
            Object objFr = this.a.fr();
            ojl.ay(((ole) objFr).a);
            ogw ogwVar = new ogw();
            ogwVar.a = new old(objFr, intent, i);
            ogwVar.c = 34401;
            ((oet) objFr).i(ogwVar.a());
            return;
        }
        Intent data = new Intent("android.intent.action.VIEW").setData(((GoogleHelp) intent.getParcelableExtra("EXTRA_GOOGLE_HELP")).q);
        if (iA == 7) {
            iA = 7;
        } else if (!((Activity) obj).getPackageManager().queryIntentActivities(data, 0).isEmpty()) {
            new ols(Looper.getMainLooper()).post(new nzq(this, data, 10));
            return;
        }
        if (true == oef.c(context, iA)) {
            iA = 18;
        }
        odn.a.c((Activity) obj, iA, 0, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final String d(String str) {
        ?? r0 = this.b;
        String str2 = (String) r0.get(str);
        if (str2 != null) {
            return str2;
        }
        int size = r0.size();
        String str3 = "";
        do {
            str3 = ((char) ((size % 26) + 97)) + str3;
            size = (size / 26) - 1;
        } while (size >= 0);
        r0.put(str, str3);
        ((ArrayList) this.a).add(str);
        return str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final syu g(Uri uri) {
        return ((ren) this.b).b(new qcj(uri, 12), this.a);
    }

    public qas(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public qas(ren renVar, Executor executor) {
        this.b = renVar;
        this.a = executor;
    }

    public qas() {
        this.b = new HashMap();
        this.a = new ArrayList();
    }

    public qas(pmv pmvVar) {
        this.b = pmvVar;
        pmq[] pmqVarArr = (pmq[]) pmvVar.b;
        Comparator[] comparatorArr = new Comparator[pmqVarArr.length];
        for (int i = 0; i < pmqVarArr.length; i++) {
            Class cls = pmqVarArr[i].b;
            if (cls == String.class) {
                comparatorArr[i] = new ccn(19);
            } else if (cls == Integer.class) {
                comparatorArr[i] = new ccn(20);
            } else if (cls == Boolean.class) {
                comparatorArr[i] = new ptf(1);
            }
        }
        this.a = new TreeMap(new pms(comparatorArr));
    }

    public qas(Context context) {
        this.b = context.getPackageName();
        this.a = AccountManager.get(context);
    }

    public qas(rwc rwcVar, rww rwwVar) {
        this.a = rwcVar;
        this.b = rnt.y(rwwVar);
    }
}
