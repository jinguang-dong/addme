package defpackage;

import org.chromium.net.NetworkException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pxl implements pxq {
    static final sbv a;

    static {
        sbr sbrVar = new sbr();
        sbrVar.f(-2, puk.ANDROID_DOWNLOADER_UNKNOWN);
        sbrVar.f(-9, puk.ANDROID_DOWNLOADER_UNKNOWN);
        sbrVar.f(-11, puk.ANDROID_DOWNLOADER_UNKNOWN);
        sbrVar.f(-3, puk.ANDROID_DOWNLOADER_CANCELED);
        sbrVar.f(-4, puk.ANDROID_DOWNLOADER_INVALID_REQUEST);
        sbrVar.f(-300, puk.ANDROID_DOWNLOADER_INVALID_REQUEST);
        sbrVar.f(-301, puk.ANDROID_DOWNLOADER_INVALID_REQUEST);
        sbrVar.f(-302, puk.ANDROID_DOWNLOADER_INVALID_REQUEST);
        sbrVar.f(-5, puk.ANDROID_DOWNLOADER_FILE_SYSTEM_ERROR);
        sbrVar.f(-6, puk.ANDROID_DOWNLOADER_FILE_SYSTEM_ERROR);
        sbrVar.f(-10, puk.ANDROID_DOWNLOADER_FILE_SYSTEM_ERROR);
        sbrVar.f(-312, puk.ANDROID_DOWNLOADER_FILE_SYSTEM_ERROR);
        sbrVar.f(-15, puk.ANDROID_DOWNLOADER_NETWORK_IO_ERROR);
        sbrVar.f(-21, puk.ANDROID_DOWNLOADER_NETWORK_IO_ERROR);
        sbrVar.f(-23, puk.ANDROID_DOWNLOADER_NETWORK_IO_ERROR);
        sbrVar.f(-100, puk.ANDROID_DOWNLOADER_NETWORK_IO_ERROR);
        sbrVar.f(-101, puk.ANDROID_DOWNLOADER_NETWORK_IO_ERROR);
        sbrVar.f(-102, puk.ANDROID_DOWNLOADER_NETWORK_IO_ERROR);
        sbrVar.f(-103, puk.ANDROID_DOWNLOADER_NETWORK_IO_ERROR);
        sbrVar.f(-104, puk.ANDROID_DOWNLOADER_NETWORK_IO_ERROR);
        sbrVar.f(-105, puk.ANDROID_DOWNLOADER_NETWORK_IO_ERROR);
        sbrVar.f(-7, puk.ANDROID_DOWNLOADER_REQUEST_ERROR);
        sbrVar.f(-27, puk.ANDROID_DOWNLOADER_REQUEST_ERROR);
        sbrVar.f(-328, puk.ANDROID_DOWNLOADER_REQUEST_ERROR);
        sbrVar.f(-303, puk.ANDROID_DOWNLOADER_RESPONSE_OPEN_ERROR);
        sbrVar.f(-310, puk.ANDROID_DOWNLOADER_RESPONSE_OPEN_ERROR);
        sbrVar.f(-311, puk.ANDROID_DOWNLOADER_RESPONSE_OPEN_ERROR);
        sbrVar.f(-320, puk.ANDROID_DOWNLOADER_RESPONSE_OPEN_ERROR);
        sbrVar.f(-321, puk.ANDROID_DOWNLOADER_RESPONSE_OPEN_ERROR);
        sbrVar.f(-322, puk.ANDROID_DOWNLOADER_RESPONSE_OPEN_ERROR);
        a = sbrVar.b();
    }

    @Override // defpackage.pxq
    public final puk a(Throwable th) {
        if (th instanceof NetworkException) {
            return puk.ANDROID_DOWNLOADER_NETWORK_IO_ERROR;
        }
        if (!(th instanceof nzz)) {
            return puk.UNKNOWN_ERROR;
        }
        return (puk) a.getOrDefault(Integer.valueOf(((nzz) th).a.a), puk.UNKNOWN_ERROR);
    }
}
