package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.ar.core.ImageMetadata;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class og {
    public final Map a = new LinkedHashMap();
    public final Map b = new LinkedHashMap();
    public final Map c = new LinkedHashMap();
    public final List d = new ArrayList();
    public final transient Map e = new LinkedHashMap();
    public final Map f = new LinkedHashMap();
    public final Bundle g = new Bundle();
    final /* synthetic */ nh h;

    public og(nh nhVar) {
        this.h = nhVar;
    }

    public static final Integer b() {
        uko ukoVar = ukp.a;
        return Integer.valueOf(ukp.b.b() + ImageMetadata.CONTROL_AE_ANTIBANDING_MODE);
    }

    public final oc a(String str, ok okVar, ob obVar) {
        str.getClass();
        d(str);
        this.e.put(str, new byz(obVar, okVar, (byte[]) null));
        Map map = this.f;
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            map.remove(str);
            obVar.a(obj);
        }
        Bundle bundle = this.g;
        oa oaVar = (oa) bundle.getParcelable(str, oa.class);
        if (oaVar != null) {
            bundle.remove(str);
            obVar.a(okVar.a(oaVar.a, oaVar.b));
        }
        return new of(this, str, okVar);
    }

    public final void c(int i, String str) {
        Map map = this.a;
        Integer numValueOf = Integer.valueOf(i);
        map.put(numValueOf, str);
        this.b.put(str, numValueOf);
    }

    public final void d(String str) {
        if (((Integer) this.b.get(str)) == null) {
            Iterator itA = ujp.L(new ulh(new adq(1), new umz(1))).a();
            while (itA.hasNext()) {
                Number number = (Number) itA.next();
                if (!this.a.containsKey(Integer.valueOf(number.intValue()))) {
                    c(number.intValue(), str);
                    return;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    public final void e(String str) {
        Integer num;
        if (!this.d.contains(str) && (num = (Integer) this.b.remove(str)) != null) {
            this.a.remove(num);
        }
        this.e.remove(str);
        Map map = this.f;
        if (map.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + map.get(str));
            map.remove(str);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((oa) bundle.getParcelable(str, oa.class)));
            bundle.remove(str);
        }
        Map map2 = this.c;
        ebn ebnVar = (ebn) map2.get(str);
        if (ebnVar != null) {
            ?? r1 = ebnVar.b;
            Iterator it = r1.iterator();
            while (it.hasNext()) {
                ((cwc) ebnVar.a).c((cwf) it.next());
            }
            r1.clear();
            map2.remove(str);
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, ob] */
    public final boolean f(int i, int i2, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        byz byzVar = (byz) this.e.get(str);
        if ((byzVar != null ? byzVar.b : null) != null) {
            List list = this.d;
            if (list.contains(str)) {
                byzVar.b.a(((ok) byzVar.a).a(i2, intent));
                list.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new oa(i2, intent));
        return true;
    }

    public final void g(int i, ok okVar, Object obj) {
        Bundle bundleExtra;
        nh nhVar = this.h;
        ejs ejsVarC = okVar.c(nhVar, obj);
        if (ejsVarC != null) {
            new Handler(Looper.getMainLooper()).post(new ng(this, i, ejsVarC, 0, (byte[]) null));
            return;
        }
        Intent intentB = okVar.b(obj);
        if (intentB.getExtras() != null) {
            Bundle extras = intentB.getExtras();
            extras.getClass();
            if (extras.getClassLoader() == null) {
                intentB.setExtrasClassLoader(nhVar.getClassLoader());
            }
        }
        if (intentB.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intentB.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentB.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleExtra = null;
        }
        Bundle bundle = bundleExtra;
        if (!a.ao("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", intentB.getAction())) {
            if (!a.ao("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", intentB.getAction())) {
                nhVar.startActivityForResult(intentB, i, bundle);
                return;
            }
            oj ojVar = (oj) intentB.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                ojVar.getClass();
                nhVar.startIntentSenderForResult(ojVar.a, i, ojVar.b, ojVar.c, ojVar.d, 0, bundle);
                return;
            } catch (IntentSender.SendIntentException e) {
                new Handler(Looper.getMainLooper()).post(new ng(this, i, e, 2));
                return;
            }
        }
        String[] stringArrayExtra = intentB.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        if (stringArrayExtra == null) {
            stringArrayExtra = new String[0];
        }
        HashSet hashSet = new HashSet();
        int i2 = 0;
        while (true) {
            int length = stringArrayExtra.length;
            if (i2 >= length) {
                int size = hashSet.size();
                String[] strArr = size > 0 ? new String[length - size] : stringArrayExtra;
                if (size > 0) {
                    if (size == length) {
                        return;
                    }
                    int i3 = 0;
                    for (int i4 = 0; i4 < stringArrayExtra.length; i4++) {
                        if (!hashSet.contains(Integer.valueOf(i4))) {
                            strArr[i3] = stringArrayExtra[i4];
                            i3++;
                        }
                    }
                }
                if (nhVar instanceof bp) {
                }
                nhVar.requestPermissions(stringArrayExtra, i);
                return;
            }
            if (TextUtils.isEmpty(stringArrayExtra[i2])) {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(stringArrayExtra) + " must not contain null or empty values");
            }
            i2++;
        }
    }

    public og() {
    }
}
