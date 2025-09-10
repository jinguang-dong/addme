package defpackage;

import android.hardware.camera2.CaptureRequest;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pix implements pnw {
    private final CaptureRequest a;

    public pix(CaptureRequest captureRequest) {
        this.a = captureRequest;
    }

    @Override // defpackage.pnw
    public final Object a(CaptureRequest.Key key) {
        return this.a.get(key);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return a.K(this.a, ((pix) obj).a);
    }

    @Override // defpackage.pnt
    public final Object ex(Class cls) {
        throw null;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // defpackage.pns
    public final qaq j() {
        throw null;
    }

    public final String toString() throws IOException {
        String string;
        try {
            ArrayList arrayList = new ArrayList();
            for (CaptureRequest.Key<?> key : this.a.getKeys()) {
                String name = key.getName();
                Object objA = a(key);
                if (objA == null) {
                    string = "null";
                } else if (objA.getClass().isArray()) {
                    ArrayList arrayList2 = new ArrayList();
                    int length = Array.getLength(objA);
                    for (int i = 0; i < length; i++) {
                        arrayList2.add(Array.get(objA, i).toString());
                    }
                    string = rnt.Z(arrayList2, ", ");
                } else {
                    string = objA.toString();
                }
                arrayList.add(name + " : " + string);
            }
            return rnt.Z(arrayList, "\n");
        } catch (IllegalStateException unused) {
            return "";
        }
    }
}
