package defpackage;

import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.OperationApplicationException;
import android.net.Uri;
import android.os.RemoteException;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hcc {
    private static final sgv a = sgv.g("hcc");
    private final ContentResolver b;

    public hcc(ContentResolver contentResolver) {
        this.b = contentResolver;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [sgt, shi] */
    public final Map a(List list) throws RemoteException, OperationApplicationException {
        ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            arrayList.add(ContentProviderOperation.newAssertQuery(uri).withValue("_id", uri.getLastPathSegment()).build());
        }
        HashMap map = new HashMap();
        try {
            ContentProviderResult[] contentProviderResultArrApplyBatch = this.b.applyBatch("com.google.android.libraries.photos.api.mars", arrayList);
            for (int i = 0; i < contentProviderResultArrApplyBatch.length; i++) {
                map.put(arrayList.get(i).getUri(), Boolean.valueOf(((Integer) Optional.ofNullable(contentProviderResultArrApplyBatch[i].count).orElse(0)).intValue() > 0));
            }
            return map;
        } catch (OperationApplicationException | RemoteException e) {
            ((sgt) ((sgt) a.b().i(e)).M((char) 1149)).s("Failed to query for mars items.");
            return map;
        }
    }
}
