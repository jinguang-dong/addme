package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eoy {
    public static boolean a(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static boolean b(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }

    public static boolean c(Uri uri) {
        return uri.getPathSegments().contains("video");
    }

    public static int d(List list, eqg eqgVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iA = eqgVar.a((eqc) list.get(i));
            if (iA != -1) {
                return iA;
            }
        }
        return -1;
    }

    public static ImageHeaderParser$ImageType e(List list, ByteBuffer byteBuffer) {
        return byteBuffer == null ? ImageHeaderParser$ImageType.UNKNOWN : f(list, new eqd(byteBuffer, 0));
    }

    public static ImageHeaderParser$ImageType f(List list, eqh eqhVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser$ImageType imageHeaderParser$ImageTypeA = eqhVar.a((eqc) list.get(i));
            if (imageHeaderParser$ImageTypeA != ImageHeaderParser$ImageType.UNKNOWN) {
                return imageHeaderParser$ImageTypeA;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static int g(List list, InputStream inputStream, etl etlVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new exi(inputStream, etlVar);
        }
        inputStream.mark(5242880);
        return d(list, new eqf(inputStream, etlVar, 0));
    }

    public static ImageHeaderParser$ImageType h(List list, InputStream inputStream, etl etlVar) {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new exi(inputStream, etlVar);
        }
        inputStream.mark(5242880);
        return f(list, new eqd(inputStream, 1));
    }

    public static Bitmap j(InputStream inputStream, BitmapFactory.Options options) {
        return BitmapFactory.decodeStream(inputStream, null, options);
    }

    public static final int k(int i, ByteBuffer byteBuffer) {
        if (m(i, 4, byteBuffer)) {
            return byteBuffer.getInt(i);
        }
        return -1;
    }

    public static final short l(int i, ByteBuffer byteBuffer) {
        if (m(i, 2, byteBuffer)) {
            return byteBuffer.getShort(i);
        }
        return (short) -1;
    }

    private static final boolean m(int i, int i2, ByteBuffer byteBuffer) {
        return byteBuffer.remaining() - i >= i2;
    }
}
