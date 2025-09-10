package defpackage;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.internal.oQFY.clFzVRcygwbq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rbo {
    public static final ClipData a = ClipData.newIntent("", new Intent());

    private static boolean b(int i, int i2) {
        return (i & i2) == i2;
    }

    public static Intent a(Intent intent, int i, int i2) {
        rnt.B((i & 88) == 0, "Cannot set any dangerous parts of intent to be mutable.");
        rnt.B((i & 1) == 0 || b(i2, 3), "Cannot use Intent.FILL_IN_ACTION unless the action is marked as mutable.");
        rnt.B((i & 2) == 0 || b(i2, 5), "Cannot use Intent.FILL_IN_DATA unless the data is marked as mutable.");
        rnt.B((i & 4) == 0 || b(i2, 9), "Cannot use Intent.FILL_IN_CATEGORIES unless the category is marked as mutable.");
        rnt.B((i & 128) == 0 || b(i2, 17), "Cannot use Intent.FILL_IN_CLIP_DATA unless the clip data is marked as mutable.");
        rnt.B(intent.getComponent() != null, "Must set component on Intent.");
        if (b(i2, 1)) {
            rnt.B(!b(i, 67108864), "Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.");
        } else {
            rnt.B(b(i, 67108864), "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.");
        }
        Intent intent2 = new Intent(intent);
        if (!b(i, 67108864)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            boolean zB = b(i2, 3);
            String str = clFzVRcygwbq.uiJvaYc;
            if (!zB && intent2.getAction() == null) {
                intent2.setAction(str);
            }
            if (!b(i2, 9) && intent2.getCategories() == null) {
                intent2.addCategory(str);
            }
            if (!b(i2, 5) && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!b(i2, 17) && intent2.getClipData() == null) {
                intent2.setClipData(a);
            }
        }
        return intent2;
    }
}
