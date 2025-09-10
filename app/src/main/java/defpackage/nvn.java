package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import com.google.android.camera.experimental2022.ExperimentalKeys;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nvn {
    public static final CaptureResult.Key a;
    public static final CaptureResult.Key b;
    public static final CaptureResult.Key c;
    public static final CaptureRequest.Key d;
    public static final CaptureResult.Key e;
    public static final CaptureRequest.Key f;
    public static final CaptureResult.Key g;
    public static final CaptureRequest.Key h;
    public static final CaptureResult.Key i;
    public static final CaptureRequest.Key j;
    public static final CaptureRequest.Key k;
    public static final CameraCharacteristics.Key l;
    public static final CaptureResult.Key m;
    public static final Integer n;
    private static final boolean o = nvr.b(8);
    private static final boolean p;
    private static final boolean q;
    private static final boolean r;

    static {
        boolean zB = nvr.b(10);
        p = zB;
        boolean zB2 = nvr.b(11);
        q = zB2;
        boolean zB3 = nvr.b(13);
        r = zB3;
        CaptureResult.Key key = null;
        a = a(1) ? ExperimentalKeys.RESULT_AF_TARGET_FOCUS : zB ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_AF_TARGET_FOCUS : zB2 ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_AF_TARGET_FOCUS : zB3 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_AF_TARGET_FOCUS : null;
        b = a(1) ? ExperimentalKeys.RESULT_AF_MULTI_DEPTH_FACE_DEBLUR : zB ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_AF_MULTI_DEPTH_FACE_DEBLUR : zB2 ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_AF_MULTI_DEPTH_FACE_DEBLUR : zB3 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_AF_MULTI_DEPTH_FACE_DEBLUR : null;
        if (a(1)) {
            CaptureRequest.Key key2 = ExperimentalKeys.REQUEST_MULTI_DEPTH_FACE_DEBLUR_ACTIVE;
        } else if (zB) {
            CaptureRequest.Key key3 = com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_MULTI_DEPTH_FACE_DEBLUR_ACTIVE;
        } else if (zB2) {
            CaptureRequest.Key key4 = com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_MULTI_DEPTH_FACE_DEBLUR_ACTIVE;
        } else if (zB3) {
            CaptureRequest.Key key5 = com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_MULTI_DEPTH_FACE_DEBLUR_ACTIVE;
        }
        if (a(1)) {
            CaptureResult.Key key6 = ExperimentalKeys.RESULT_MULTI_DEPTH_FACE_DEBLUR_ACTIVE;
        } else if (zB) {
            CaptureResult.Key key7 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_MULTI_DEPTH_FACE_DEBLUR_ACTIVE;
        } else if (zB2) {
            CaptureResult.Key key8 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_MULTI_DEPTH_FACE_DEBLUR_ACTIVE;
        } else if (zB3) {
            CaptureResult.Key key9 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_MULTI_DEPTH_FACE_DEBLUR_ACTIVE;
        }
        if (!ojl.aH()) {
            if (a(1)) {
                CaptureRequest.Key key10 = ExperimentalKeys.REQUEST_AF_DEBUG_CONTROL;
            } else if (zB) {
                CaptureRequest.Key key11 = com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_AF_DEBUG_CONTROL;
            } else if (zB2) {
                CaptureRequest.Key key12 = com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_AF_DEBUG_CONTROL;
            } else if (zB3) {
                CaptureRequest.Key key13 = com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_AF_DEBUG_CONTROL;
            }
        }
        if (!ojl.aH()) {
            if (a(1)) {
                CaptureResult.Key key14 = ExperimentalKeys.RESULT_AF_DEBUG_CONTROL;
            } else if (zB) {
                CaptureResult.Key key15 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_AF_DEBUG_CONTROL;
            } else if (zB2) {
                CaptureResult.Key key16 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_AF_DEBUG_CONTROL;
            } else if (zB3) {
                CaptureResult.Key key17 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_AF_DEBUG_CONTROL;
            }
        }
        c = a(2) ? ExperimentalKeys.RESULT_ULTRAHDR_ENABLED : zB ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_ULTRAHDR_ENABLED : zB2 ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_ULTRAHDR_ENABLED : zB3 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_ULTRAHDR_ENABLED : null;
        d = a(3) ? ExperimentalKeys.REQUEST_AF_MACRO_MODE : zB ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_AF_MACRO_MODE : zB2 ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_AF_MACRO_MODE : zB3 ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_AF_MACRO_MODE : null;
        if (a(3)) {
            CaptureResult.Key key18 = ExperimentalKeys.RESULT_AF_MACRO_MODE;
        } else if (zB) {
            CaptureResult.Key key19 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_AF_MACRO_MODE;
        } else if (zB2) {
            CaptureResult.Key key20 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_AF_MACRO_MODE;
        } else if (zB3) {
            CaptureResult.Key key21 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_AF_MACRO_MODE;
        }
        if (a(4)) {
            CaptureResult.Key key22 = ExperimentalKeys.RESULT_AE_TIMEOUT;
        } else if (zB) {
            CaptureResult.Key key23 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_AE_TIMEOUT;
        } else if (zB2) {
            CaptureResult.Key key24 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_AE_TIMEOUT;
        } else if (zB3) {
            CaptureResult.Key key25 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_AE_TIMEOUT;
        }
        e = a(5) ? ExperimentalKeys.RESULT_FACE_RECTANGLE_SKIN_AREA : zB ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_FACE_RECTANGLE_SKIN_AREA : zB2 ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_FACE_RECTANGLE_SKIN_AREA : zB3 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_FACE_RECTANGLE_SKIN_AREA : null;
        f = a(6) ? ExperimentalKeys.REQUEST_3A_VIDEO_METADATA_MODE : zB ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_3A_VIDEO_METADATA_MODE : zB2 ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_3A_VIDEO_METADATA_MODE : zB3 ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_3A_VIDEO_METADATA_MODE : null;
        g = a(6) ? ExperimentalKeys.RESULT_3A_VIDEO_METADATA_MODE : zB ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_3A_VIDEO_METADATA_MODE : zB2 ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_3A_VIDEO_METADATA_MODE : zB3 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_3A_VIDEO_METADATA_MODE : null;
        h = a(8) ? ExperimentalKeys.REQUEST_MESH_WARP_IS_FORWARD_MESH : zB ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_MESH_WARP_IS_FORWARD_MESH : zB2 ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_MESH_WARP_IS_FORWARD_MESH : zB3 ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_MESH_WARP_IS_FORWARD_MESH : null;
        i = a(7) ? ExperimentalKeys.RESULT_MESH_WARP_IS_FORWARD_MESH : zB ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_MESH_WARP_IS_FORWARD_MESH : zB2 ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_MESH_WARP_IS_FORWARD_MESH : zB3 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_MESH_WARP_IS_FORWARD_MESH : null;
        if (a(9)) {
            CaptureResult.Key key26 = ExperimentalKeys.RESULT_TUNING_USE_CASE;
        } else if (zB) {
            CaptureResult.Key key27 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_TUNING_USE_CASE;
        } else if (zB2) {
            CaptureResult.Key key28 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_TUNING_USE_CASE;
        } else if (zB3) {
            CaptureResult.Key key29 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_TUNING_USE_CASE;
        }
        if (a(10)) {
            CaptureResult.Key key30 = ExperimentalKeys.RESULT_FACE_UNLOCK_AWB_INFORMATION;
        } else if (zB) {
            CaptureResult.Key key31 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_FACE_UNLOCK_AWB_INFORMATION;
        } else if (zB2) {
            CaptureResult.Key key32 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_FACE_UNLOCK_AWB_INFORMATION;
        } else if (zB3) {
            CaptureResult.Key key33 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_FACE_UNLOCK_AWB_INFORMATION;
        }
        j = a(11) ? ExperimentalKeys.REQUEST_FAST_ZOOM_MODE : zB ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_FAST_ZOOM_MODE : zB2 ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_FAST_ZOOM_MODE : zB3 ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_FAST_ZOOM_MODE : null;
        k = a(11) ? ExperimentalKeys.REQUEST_ZOOM_TARGET : zB ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_ZOOM_TARGET : zB2 ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_ZOOM_TARGET : zB3 ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_ZOOM_TARGET : null;
        l = a(12) ? ExperimentalKeys.CHARACTERISTICS_EEPROM_2D_BLC_BLOB : zB ? com.google.android.camera.experimental2023.ExperimentalKeys.CHARACTERISTICS_EEPROM_2D_BLC_BLOB : zB2 ? com.google.android.camera.experimental2024.ExperimentalKeys.CHARACTERISTICS_EEPROM_2D_BLC_BLOB : zB3 ? com.google.android.camera.experimental2025.ExperimentalKeys.CHARACTERISTICS_EEPROM_2D_BLC_BLOB : null;
        if (a(13)) {
            CaptureResult.Key key34 = ExperimentalKeys.RESULT_AF_EYE_ROI;
        } else if (b(24)) {
            CaptureResult.Key key35 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_AF_EYE_ROI;
        } else if (zB2) {
            CaptureResult.Key key36 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_AF_EYE_ROI;
        } else if (zB3) {
            CaptureResult.Key key37 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_AF_EYE_ROI;
        }
        if (a(14)) {
            key = ExperimentalKeys.RESULT_MULTICAM_LEADCAMID;
        } else if (b(35)) {
            key = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_MULTICAM_LEADCAMID;
        } else if (c()) {
            key = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_MULTICAM_LEADCAMID;
        } else if (zB3) {
            key = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_MULTICAM_LEADCAMID;
        }
        m = key;
        n = 2;
        if (a(16)) {
            CaptureRequest.Key key38 = ExperimentalKeys.REQUEST_OVERRIDE_SENSOR_SYNC_MODE;
        } else if (b(13)) {
            CaptureRequest.Key key39 = com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_OVERRIDE_SENSOR_SYNC_MODE;
        } else if (zB2) {
            CaptureRequest.Key key40 = com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_OVERRIDE_SENSOR_SYNC_MODE;
        } else if (zB3) {
            CaptureRequest.Key key41 = com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_OVERRIDE_SENSOR_SYNC_MODE;
        }
        if (a(16)) {
            CaptureResult.Key key42 = ExperimentalKeys.RESULT_OVERRIDE_SENSOR_SYNC_MODE;
            return;
        }
        if (b(13)) {
            CaptureResult.Key key43 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_OVERRIDE_SENSOR_SYNC_MODE;
        } else if (zB2) {
            CaptureResult.Key key44 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_OVERRIDE_SENSOR_SYNC_MODE;
        } else if (zB3) {
            CaptureResult.Key key45 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_OVERRIDE_SENSOR_SYNC_MODE;
        }
    }

    public static boolean a(int i2) {
        if (o) {
            try {
                if (i2 <= ExperimentalKeys.getLibraryVersion()) {
                    return true;
                }
            } catch (NoSuchFieldError | NoSuchMethodError unused) {
            }
        }
        return false;
    }

    public static boolean b(int i2) {
        if (p) {
            try {
                if (i2 <= com.google.android.camera.experimental2023.ExperimentalKeys.getLibraryVersion()) {
                    return true;
                }
            } catch (NoSuchFieldError | NoSuchMethodError unused) {
            }
        }
        return false;
    }

    public static boolean c() {
        if (q) {
            try {
                if (com.google.android.camera.experimental2024.ExperimentalKeys.getLibraryVersion() >= 3) {
                    return true;
                }
            } catch (NoSuchFieldError | NoSuchMethodError unused) {
            }
        }
        return false;
    }
}
