package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.camera.modeldownloader.uD.uCzt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ol extends ok {
    @Override // defpackage.ok
    public final /* bridge */ /* synthetic */ Object a(int i, Intent intent) {
        if (i != -1) {
            return ufx.a;
        }
        if (intent == null) {
            return ufx.a;
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra(uCzt.OkrvkkwxDsbnH);
        if (intArrayExtra == null || stringArrayExtra == null) {
            return ufx.a;
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i2 : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i2 == 0));
        }
        List listAo = rnt.ao(stringArrayExtra);
        Iterator it = listAo.iterator();
        Iterator it2 = arrayList.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(ske.bq(listAo, 10), ske.bq(arrayList, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList2.add(new uev(it.next(), it2.next()));
        }
        return ske.bf(arrayList2);
    }

    @Override // defpackage.ok
    public final /* bridge */ /* synthetic */ Intent b(Object obj) {
        String[] strArr = (String[]) obj;
        strArr.getClass();
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
        intentPutExtra.getClass();
        return intentPutExtra;
    }

    @Override // defpackage.ok
    public final /* bridge */ /* synthetic */ ejs c(Context context, Object obj) {
        String[] strArr = (String[]) obj;
        strArr.getClass();
        if (strArr.length == 0) {
            return new ejs(ufx.a);
        }
        for (String str : strArr) {
            if (clu.a(context, str) != 0) {
                return null;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(ukc.n(ske.aZ(strArr.length), 16));
        for (String str2 : strArr) {
            uev uevVar = new uev(str2, true);
            linkedHashMap.put(uevVar.a, uevVar.b);
        }
        return new ejs(linkedHashMap);
    }
}
