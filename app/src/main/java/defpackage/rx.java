package defpackage;

import android.util.Log;
import android.view.Surface;
import com.google.android.apps.camera.coach.YOHg.INRGuObcrHjSQz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rx implements ti {
    private final /* synthetic */ int a;

    public rx(qrh qrhVar, int i, byte[] bArr) {
        this.a = i;
        qrhVar.getClass();
    }

    public rx(qrh qrhVar, int i) {
        this.a = i;
        qrhVar.getClass();
    }

    @Override // defpackage.ti
    public final Map a(ta taVar, Map map, tm tmVar) throws Exception {
        if (this.a != 0) {
            ArrayList arrayList = new ArrayList(map.size());
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add((Surface) ((Map.Entry) it.next()).getValue());
            }
            if (!taVar.i(arrayList, tmVar)) {
                Log.w("CXCP", mn.e((byte) 33, tmVar, taVar, "Failed to create capture session from ", " for "));
                tmVar.g();
            }
            return ufx.a;
        }
        ArrayList arrayList2 = new ArrayList(map.size());
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList2.add((Surface) ((Map.Entry) it2.next()).getValue());
        }
        if (!taVar.k(arrayList2, tmVar)) {
            Log.w("CXCP", mn.e((byte) 33, tmVar, taVar, INRGuObcrHjSQz.jYWbySDsCw, " for "));
            tmVar.h();
        }
        return ufx.a;
    }
}
