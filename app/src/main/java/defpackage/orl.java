package defpackage;

import android.net.Uri;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.oQFY.clFzVRcygwbq;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class orl extends ohc {
    private final int d;

    public orl(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.d = i2;
    }

    public final String toString() {
        DataHolder dataHolder = this.a;
        int i = this.b;
        int i2 = this.c;
        dataHolder.c("data", i);
        byte[] blob = dataHolder.d[i2].getBlob(i, dataHolder.c.getInt("data"));
        int i3 = this.d;
        HashMap map = new HashMap(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            ohc ohcVar = new ohc(this.a, this.b + i4);
            if (ohcVar.c() != null) {
                map.put(ohcVar.c(), ohcVar);
            }
        }
        StringBuilder sb = new StringBuilder("DataItemRef{ ");
        sb.append("uri=".concat(String.valueOf(String.valueOf(Uri.parse(a("path"))))));
        sb.append(", dataSz=".concat((blob == null ? "null" : Integer.valueOf(blob.length)).toString()));
        sb.append(clFzVRcygwbq.gzOskWQlAvJ + map.size());
        sb.append(" }");
        return sb.toString();
    }
}
