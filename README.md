# Offline Talks 2.0 — New Android Source

This is a fresh Kotlin Android project with a green chat UI and Google Nearby Connections P2P_CLUSTER transport.

## Included in this source
- Nearby device advertising/discovery and connection prompts.
- Automatic UTF-8 text chunking into 12 KiB raw chunks and receiver-side reassembly.
- Per-recipient application-level delivery confirmation (ACK sent only after all chunks are reassembled).
- 10 MiB maximum text size per message in this implementation; not literally unlimited.
- Multi-endpoint broadcast foundation.
- Message long-press actions: delete for everyone (broadcast control) and delete for me; copy.
- Image/file picker and Nearby FILE payload sending.
- Voice-note recording and file payload sending; incoming voice notes are saved and can be played.
- GitHub Actions workflow to build a debug APK.
- Android minSdk 26.

## Important status
This project is a development build, not a verified production release. It has not been compiled or tested on physical phones in this environment. The current attachment metadata handling and message delivery need validation; delete-for-everyone is a basic broadcast and is not a durable tombstone protocol. Chat persistence, read receipts, reply/edit/forward, group membership management, background reconnection, end-to-end app-level encryption, and robust media preview are not complete. Delivery ACKs are in-memory and per currently connected endpoint; they are not durable across app restarts or offline recipients.

**Voice calls are NOT complete in this source.** Incoming call prompt and call signaling are scaffolded, but real full-duplex audio streaming has not been implemented. Do not install this expecting working calls.

The app uses Google Nearby Connections for local device-to-device transports. It is designed for offline nearby communication, without an app backend or cloud server; actual offline behavior and device compatibility must be validated on target Android phones. Google Play services availability is required on most Android devices.

## GitHub build
Upload the contents to your repository root. GitHub Actions -> Build Offline Talks APK -> download `OfflineTalks-debug-apk` artifact from a successful run.
