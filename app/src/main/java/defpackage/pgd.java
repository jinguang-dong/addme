package defpackage;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class pgd implements rvu {
    public final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public /* synthetic */ pgd(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // defpackage.rvu
    public final Object apply(Object obj) {
        if (this.b == 0) {
            return Integer.valueOf(Math.min(((Long) obj).intValue(), this.a));
        }
        List list = (List) obj;
        PointF pointF = (PointF) list.get(0);
        boolean zBooleanValue = ((Boolean) list.get(1)).booleanValue();
        shl shlVar = shx.a;
        return ByteBuffer.allocate(13).order(ByteOrder.nativeOrder()).putInt(this.a).putFloat(pointF.x).putFloat(pointF.y).put(zBooleanValue ? (byte) 1 : (byte) 0).array();
    }
}
